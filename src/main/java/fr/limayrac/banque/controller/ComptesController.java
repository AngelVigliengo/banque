package fr.limayrac.banque.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping(value = "/compte", method = RequestMethod.GET)
public class ComptesController {
    private  static final Logger logger = LoggerFactory.getLogger(ComptesController.class);

    @RequestMapping(value = "/lister")
    public ModelAndView newHome(HttpServletRequest req, HttpServletResponse rep){
        Map<String, Object> model = new HashMap<String, Object>();

        model.put("AV", "N12");
        return new ModelAndView("listeCompte","data", model);
    }

    @RequestMapping(value = "/lister/{compte}")
    @ResponseBody
    public String detailCompte
            (@PathVariable String compte) {
        return "url du compte :"+ compte;
    }

    @RequestMapping(path = "/effacer")
    @ResponseBody
    public String effacerCompte(){
        return "effacer un compte";
    }
}