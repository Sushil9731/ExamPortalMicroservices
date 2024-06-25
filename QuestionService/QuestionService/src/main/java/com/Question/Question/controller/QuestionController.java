package com.Question.Question.controller;

import com.Question.Question.entities.Question;
import com.Question.Question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/get")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    //create

    @PostMapping("/create")
    public Question create(@RequestBody Question question)
    {

        return questionService.create(question);
    }

    // get All
    @GetMapping("/getall")
    public List<Question> getAll()
    {
        return questionService.get();
    }

    @GetMapping("/{questionid}")
    public Question get(@PathVariable Long questionid)
    {
        return questionService.getOne(questionid);
    }

    // get all the questions of specific quiz

    @GetMapping("/quiz/{quizId}")
    public List<Question>  getQuestionsOfQuiz(@PathVariable Long quizId)
    {
        return questionService.getQuestionsOfQuiz(quizId);
    }


}
