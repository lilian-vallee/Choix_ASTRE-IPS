package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.Etudiant;
import com.ensim.choixAstreIPS.Moteur;
import com.ensim.choixAstreIPS.Utils.QuestionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtudiantController {

    @GetMapping("/etudiants")
    public String getEtudiants(Model model) {
        model.addAttribute("allEtudiants", Moteur.INSTANCE.getEtudiants());
        return "etudiants";
    }

    @GetMapping("/reponses")
    public String getReponsesFromEtudiant(@RequestParam String etu, Model model) {
        Etudiant etud = Moteur.INSTANCE.getEtudiants().stream().filter(etudiant -> etu.equals(etudiant.getId())).findFirst().orElse(new Etudiant());
        model.addAttribute("etudiant", etud);
        model.addAttribute("questions", QuestionUtils.getQuestionsList());
        return "reponses";
    }
}
