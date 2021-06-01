package htw.wichteln;

import config.Endpoints;
import config.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

    @GetMapping(path = Endpoints.INDEX)
    public ModelAndView showIndexPage() {
        return new ModelAndView(ViewNames.INDEX);
    }
    @GetMapping(path = Endpoints.GALLERY)
    public ModelAndView showGalleryPage() {
        return new ModelAndView(ViewNames.GALLERY);
    }
    @GetMapping(path = Endpoints.LOGIN)
    public ModelAndView showLoginPage() {
        return new ModelAndView(ViewNames.LOGIN);
    }
    @GetMapping(path = Endpoints.WICHTELN)
    public ModelAndView showWichtelnPage() {
        return new ModelAndView(ViewNames.WICHTELN);
    }
    @GetMapping(path = Endpoints.TEST)
    public ModelAndView showTestPage() {
        return new ModelAndView(ViewNames.TEST);
    }

}
