package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.Etudiant;
import com.ensim.choixAstreIPS.Moteur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtudiantController {

    private final Moteur moteur = new Moteur();

    @GetMapping("/etudiants")
    public String getEtudiants(Model model) {
        if( moteur.getEtudiants().size() == 0 )
            moteur.loadQuestionnaire3A();
        model.addAttribute("allEtudiants", moteur.getEtudiants());
        return "etudiants";
    }

    @GetMapping("/reponses")
    public String getReponsesFromEtudiant(@RequestParam String etu, Model model) {
        Etudiant etud = moteur.getEtudiants().stream().filter(etudiant -> etu.equals(etudiant.getId())).findFirst().orElse(new Etudiant());
        model.addAttribute("etudiant", etud);
        return "reponses";
    }
}
