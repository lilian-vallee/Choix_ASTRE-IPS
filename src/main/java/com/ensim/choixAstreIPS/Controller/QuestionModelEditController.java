package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.MotCle;
import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.ensim.choixAstreIPS.Moteur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionModelEditController {

    @GetMapping("/QuestionModelEdit")
    public String getModels(@RequestParam int index, Model model) {
        QuestionModel questionModel = Moteur.INSTANCE.getModels().get(index-1);
        model.addAttribute("questionModel", questionModel);
        model.addAttribute("getMotsCles", questionModel.getMotsCles());
        model.addAttribute("newMotCle", new MotCle("mot",0,0));
        return "QuestionModelEdit";
    }

    @PostMapping("/QuestionModelEdit")
    public String SaveCoeff(@ModelAttribute QuestionModel questionModel, @RequestParam int index){
        Moteur.INSTANCE.getModels().set(index-1, questionModel);
        return "QuestionModelEdit";
    }
}
