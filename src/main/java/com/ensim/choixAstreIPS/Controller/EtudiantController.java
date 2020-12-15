package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Moteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtudiantController {

    @GetMapping("/etudiants")
    public String getEtudiants(Model model) {
        Moteur moteur = new Moteur();
        moteur.loadQuestionnaire3A();
        model.addAttribute("allEtudiants", moteur.getEtudiants());
        return "etudiants";
    }
}
