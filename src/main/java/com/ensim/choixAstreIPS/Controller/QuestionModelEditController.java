package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.MotCle;
import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.ensim.choixAstreIPS.Moteur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionModelEditController {

    private int qIndex;

    @GetMapping("/QuestionModelEdit")
    public String getModels(@RequestParam(required = false, defaultValue = "-1") int qIndex,
                            Model model)
    {
        if(qIndex != -1){
            this.qIndex = qIndex;
            model.addAttribute("qIndex", this.qIndex);
        }

        QuestionModel questionModel = Moteur.INSTANCE.getModels().get(this.qIndex);
        model.addAttribute("questionModel", questionModel);
        model.addAttribute("getMotsCles", questionModel.getMotsCles());
        return "QuestionModelEdit";
    }

    @PostMapping("/QuestionModelEdit")
    public String SaveCoeff(QuestionModel questionModel,
                            Model model)
    {
        Moteur.INSTANCE.getModels().get(this.qIndex).setIntitule(questionModel.getIntitule());
        Moteur.INSTANCE.getModels().get(this.qIndex).setCoeff(questionModel.getCoeff());
        return "QuestionModelEdit";
    }
}
