package fr.limayrac.banque.controller;

import fr.limayrac.banque.model.Compte;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/compte")
public class CompteFormController {
    @GetMapping(path = "/creer")
    public String afficheCreateForm( Model model){
        Compte compte = new Compte();
        model.addAttribute("compte", compte);
        return "compteInscriptionForm";
    }

    @PostMapping(path = "/creer")
    public String submitCreateForm(@ModelAttribute("compte") Compte compte)
    {
        return "compteInscriptionSuccess";
    }

    @GetMapping(value = "/editer")
    public String afficheEditForm( Model model){
        Compte compte = new Compte();
        model.addAttribute("compte", compte);
        return "compteEditerForm";
    }

    @PostMapping(value = "/editer")
    public String submitEditForm(@ModelAttribute("compte") Compte compte)
    {
        return "compteInscriptionSuccess";
    }
}