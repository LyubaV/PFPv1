package com.sitronics.learning.pfp.weblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    ApplicationContext context;

    @RequestMapping("/pfp")
    public String testRequest(Model model) {
        model.addAttribute("acc", context.getBean("accountsBean"));
        return "testpage";
    }

}
