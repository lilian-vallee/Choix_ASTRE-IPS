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
    public String getModels(@RequestParam(required = false, defaultValue = "-1") int index, Model model) {
        if(index == -1){
            index = (int) model.getAttribute("qIndex");
        }
        else{
            model.addAttribute("qIndex", index-1);
        }
        QuestionModel questionModel = Moteur.INSTANCE.getModels().get(index-1);
        model.addAttribute("questionModel", questionModel);
        model.addAttribute("getMotsCles", questionModel.getMotsCles());
        return "QuestionModelEdit";
    }

    @PostMapping("/QuestionModelEdit")
    public String SaveCoeff(QuestionModel questionModel, @RequestParam int index, Model model){
        Moteur.INSTANCE.getModels().get(index-1).setIntitule(questionModel.getIntitule());
        Moteur.INSTANCE.getModels().get(index-1).setCoeff(questionModel.getCoeff());
        return "QuestionModelEdit";
    }
}
