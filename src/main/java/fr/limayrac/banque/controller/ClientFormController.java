package fr.limayrac.banque.controller;

import fr.limayrac.banque.model.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/client")
public class ClientFormController {
    @GetMapping(value = "/creer")
    public String afficheCreateForm( Model model){
        Client user = new Client();
        model.addAttribute("user", user);
        String[] listeProfession = {"boulanger" , "patissier" , "cuisinier"};
        model.addAttribute("listeProfession" , listeProfession);
        return "clientInscriptionForm";
    }

    @PostMapping(value = "/creer")
    public String submitCreateForm(@ModelAttribute("user") Client user)
    {
        return "clientInscriptionSuccess";
    }

    @GetMapping(value = "/editer")
    public String afficheEditForm( Model model){
        Client user = new Client();
        model.addAttribute("user", user);
        String[] listeProfession = {"boulanger" , "patissier" , "cuisinier"};
        model.addAttribute("listeProfession" , listeProfession);
        return "clientEditerForm";
    }

    @PostMapping(value = "/editer")
    public String submitEditForm(@ModelAttribute("user") Client user)
    {
        return "clientInscriptionSuccess";
    }
}