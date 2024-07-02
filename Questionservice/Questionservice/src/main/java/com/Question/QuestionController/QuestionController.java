package com.Question.QuestionController;

import com.Question.QuestionEntity.Question;
import com.Question.QuestionService.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {


    private QuestionService questionService;
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);


    }
    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }
    @GetMapping("/{quetsionId}")
    public Question getById(@PathVariable Long  questionId){
        return questionService.getOne(questionId);
    }

}
