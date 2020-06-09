package com.kappa.contactmanager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Капу пк
 * 04.05.2020
 */
@Controller
public class MvcController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printHello(Model model) {
        String s = "myCommit2";


        return "index";
    }
}
