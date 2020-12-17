package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.Etudiant;
import com.ensim.choixAstreIPS.Model.Repository.EtudiantRepository;
import com.ensim.choixAstreIPS.Moteur;
import com.ensim.choixAstreIPS.Utils.QuestionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtudiantController {

    @Autowired
    EtudiantRepository etudiantRepository;


    @GetMapping("/etudiants")
    public String getEtudiants(@RequestParam String etu, Model model) {
        if( etudiantRepository.count() == 0 ) {
            etudiantRepository.saveAll(Moteur.INSTANCE.getEtudiants());
        }
        model.addAttribute("allEtudiants", etudiantRepository.findAll());

        Etudiant etud = new Etudiant();
        if(etudiantRepository.findById(etu).isPresent() ) {
            etud = etudiantRepository.findById(etu).get();
        }
        model.addAttribute("etudiant", etud );

        return "etudiants";
    }

    @GetMapping("/reponses")
    public String getReponsesFromEtudiant(@RequestParam String etu, Model model) {
        Etudiant etud = new Etudiant();
        if(etudiantRepository.findById(etu).isPresent() ) {
            etud = etudiantRepository.findById(etu).get();
        }
        model.addAttribute("etudiant", etud );
        return "reponses";
    }
}
