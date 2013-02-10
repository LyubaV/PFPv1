package com.sitronics.learning.pfp.weblayer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sitronics.learning.pfp.servicelayer.AccountsBean;
import com.sitronics.learning.pfp.servicelayer.converters.PFPDateFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

@Controller
public class TestController {

    @Autowired
    ApplicationContext context;
    @Autowired
    AccountsBean accountsBean;
    @Autowired
    LocaleResolver localeResolver;
    @Autowired
    ConversionService conversionService;
    @Autowired
    PFPDateFormatter pfpDateFormatter;


    Logger logger = Logger.getLogger(this.getClass().toString());

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, true));
    }


    @RequestMapping("/pfp")
    public String testRequest(Model model) {
        //logger.info("Test");
        model.addAttribute("acc", accountsBean);
        model.addAttribute("date", accountsBean.getDate());
        return "testpage";
    }

    @RequestMapping(value = "/service")
    public
    @ResponseBody
    Object getJSONresponse() {
        return accountsBean;

    }

    @RequestMapping("/json")
    public
    @ResponseBody
    String getJson(WebRequest request, Model model) throws JsonProcessingException {
        request.getLocale();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper.writeValueAsString(accountsBean);
    }

    @RequestMapping(value = "/setLanguage", params = "lang")
    public String setLanguage(@RequestParam String lang, WebRequest request) throws Exception {
        // logger.info("Setting locale to " + lang);
        //if (true) throw new Exception("жопа !!!");
        request.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale(lang), WebRequest.SCOPE_SESSION);
        pfpDateFormatter.setPattern("dd.MM.yy HH:mm");
        //request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale(lang));
        // localeResolver.setLocale(request, response, new Locale(lang));
        return "redirect:/pfp";
    }

    @RequestMapping(value = "/date/{someDate}")
    @ResponseBody
    public String parseDate(@ModelAttribute @PathVariable("someDate") Date date) {

        //pfpDateFormatter.setPattern("dd.MM.yy HH:mm");
        return conversionService.convert(date, String.class);
    }

    @ExceptionHandler
    public HttpEntity<String> exceptionHandler(Exception e) {
        return new HttpEntity<String>(e.getMessage());

    }

}
