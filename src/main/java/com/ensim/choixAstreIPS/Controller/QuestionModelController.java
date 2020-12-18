package com.ensim.choixAstreIPS.Controller;

import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.ensim.choixAstreIPS.Moteur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuestionModelController {

    @GetMapping("/QuestionModel")
    public String getModels(@RequestParam(required = false, defaultValue = "false") boolean save, Model model) {
        if( save ) Moteur.INSTANCE.saveModel("Model_Save");
        model.addAttribute("allQuestionsModels", Moteur.INSTANCE.getModels());
        return "QuestionModel";
    }

    @GetMapping("/QuestionModelAdd")
    public String addQuestionModel(Model model) {
        model.addAttribute("qm_index", Moteur.INSTANCE.getModels().size() + 1);
        return "QuestionModelAdd";
    }

    @PostMapping("/QuestionModel")
    public String addedQuestionModel(@RequestParam int index, @RequestParam String intitule, @RequestParam double coeff, Model model) {
        Moteur.INSTANCE.addModel(new QuestionModel(index, intitule, coeff));
        model.addAttribute("allQuestionsModels", Moteur.INSTANCE.getModels());
        return "QuestionModel";
    }
}
