package com.sitronics.learning.pfp.weblayer;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sitronics.learning.pfp.persist.AccountsBean;
import org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.support.RequestContext;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class TestController {

    @Autowired
    ApplicationContext context;
    @Autowired
    AccountsBean accountsBean;

    Logger logger = Logger.getLogger(this.getClass().toString());

    @RequestMapping("/pfp")
    public String testRequest(Model model) {
        //logger.info("Test");
        model.addAttribute("acc", context.getBean("accountsBean"));
        return "testpage";
    }

    @RequestMapping(value = "/service")
    public @ResponseBody Object getJSONresponse(Model model) {
        return accountsBean;
    }

    @RequestMapping("/json")
    public @ResponseBody String getJson(WebRequest request, Model model) throws JsonProcessingException {
        request.getLocale();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(context.getBean("accountsBean")) + "<br> " + request.getLocale();
    }

}
