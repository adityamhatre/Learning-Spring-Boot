package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Person person) {

        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", person);
        mv.setViewName("home");
        return mv;
    }
}
