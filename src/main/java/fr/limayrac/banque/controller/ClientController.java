package fr.limayrac.banque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/client", method = RequestMethod.GET)
public class ClientController {

    @RequestMapping(value = "/lister")
    public ModelAndView newHome(HttpServletRequest req, HttpServletResponse rep){

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("Angel", "Vigliengo");
        return new ModelAndView("listeClient","data", model);
    }

    @RequestMapping(value = "/lister/{client}")
    @ResponseBody
    public String detailCompte
            (@PathVariable String client) {
        return "url du client :"+ client;
    }

    @RequestMapping(path = "/effacer")
    @ResponseBody
    public String effacerClient(){
        return "effacer un client";
    }
}
