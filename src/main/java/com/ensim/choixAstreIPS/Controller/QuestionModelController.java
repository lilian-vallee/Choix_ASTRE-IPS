package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Moteur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionModelController {

    @GetMapping("/QuestionModel")
    public String getModels(Model model) {
        Moteur moteur = new Moteur();
        model.addAttribute("allQuestionsModels", moteur.getModels());
        return "QuestionModel";
    }

}
