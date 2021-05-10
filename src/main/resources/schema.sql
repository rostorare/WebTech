create table if not exists user_table
(
    id    bigserial    not null
        constraint user_id_pkey
            primary key,
    datum varchar(255) not null

);

--alter table user_table owner to d1t23qnmhijvr9;