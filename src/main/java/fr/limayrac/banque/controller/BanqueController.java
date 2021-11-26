package fr.limayrac.banque.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class BanqueController {
    private  static final Logger logger = LoggerFactory.getLogger(BanqueController.class);

    @RequestMapping(value = "/basic", method = RequestMethod.GET)
    public String home(Locale locale, Model model){
        logger.info("Welcome at Test! The client local is {}.",locale);
        return "test";
    }

}
