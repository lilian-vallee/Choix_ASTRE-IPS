package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.MotCle;
import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.ensim.choixAstreIPS.Moteur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MotCleEditController {

    int qIndex;
    private int mIndex;

    @GetMapping("/MotCleEdit")
    public String getMotCle(@RequestParam(name = "qIndex", required = false, defaultValue = "-1") int qIndex,
                            @RequestParam int mIndex,
                            Model model)
    {
        if (qIndex != -1){
            this.qIndex = qIndex;
            this.mIndex = mIndex;
        }

        MotCle motCle;
        if (mIndex == -1){
            motCle = new MotCle("nouveau mot",0,0);
        }
        else{
            motCle = Moteur.INSTANCE.getModels().get(this.qIndex).getMotsCles().get(this.mIndex);
        }
        model.addAttribute("motCle", motCle);

        return "MotCleEdit";
    }

    @PostMapping("/MotCleEdit")
    public String SaveMotCle(MotCle motCle){
        if (mIndex == -1){
            Moteur.INSTANCE.getModels().get(this.qIndex).getMotsCles().add(motCle);
        }else{
            Moteur.INSTANCE.getModels().get(this.qIndex).getMotsCles().set(this.mIndex, motCle);
        }
        return "MotCleEdit";
    }
}
