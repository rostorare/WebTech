const app = Vue.createApp({});
app.component('dynamic-form', {
    template:`
    <div>
        <input v-model="nameField" placeholder="Name" ref="nameInput">
        <input v-model="emailField" placeholder="e-mail" @keyup.enter="save()">
        <button type="button" @click="save()">Save</button>
    </div>
    <div>
        <h3>Hier sind alle Teilnehmer</h3>
            <table>
                <thead>
                <tr>
                    <th>name</th>
                    <th>e-mail</th>
                </tr>
                </thead>
                <tbody>
                <tr v-if="items.length === 0">
                    <td colspan="2">keine Teilnehmer bis jetzt</td>
                </tr>
                <tr v-for="product in items">
                    <td>{{product.name}}</td>
                    <td>{{product.e-mail}}</td>
                </tr>
                <tr>
                    <td>{{ nameField }}</td>
                    <td>{{ emailField }}</td>
                </tr>
                </tbody>
               </table>
    </div>
     `,
    data(){
        return {
            items: [],
            nameField: '',
            emailField: '',
        };
    },
    methods:{
        loadProducts() {
            axios.get('/products')
                .then(response => (this.items = response.data))
        },
        save() {
            axios.post('/products', {
                    name: this.nameField,
                    email: this.emailField
                })
                .then((response) => {
                    this.nameField = '';
                    this.emailField = '';
                    this.$ref.nameInput.focus();
                    this.loadProducts();
                }, (error) => {
                    console.log('Could not save product!');
                });
        },
    },
    mounted: function() {
        this.loadProducts();
    }
});
app.mount('#dynamic-form');