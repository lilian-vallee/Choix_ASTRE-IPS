package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.ensim.choixAstreIPS.Moteur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionModelEditController {

    @GetMapping("/QuestionModelEdit")
    public String getModels(@RequestParam int index, Model model) {
        Moteur moteur = new Moteur();
        QuestionModel questionModel = moteur.getModels().get(index-1);
        model.addAttribute("questionModel", questionModel);
        model.addAttribute("getMotCle", questionModel.getMotsCles());
        return "QuestionModelEdit";
    }

    @PostMapping("/SaveCoeff")
    public void SaveCoeff(@ModelAttribute QuestionModel questionModel){

    }
}
