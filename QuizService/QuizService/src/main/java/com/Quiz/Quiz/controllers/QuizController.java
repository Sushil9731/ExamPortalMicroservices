package com.Quiz.Quiz.controllers;

import com.Quiz.Quiz.entities.Quiz;
import com.Quiz.Quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Quiz")
public class QuizController {


    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // create
    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz)
    {
        return quizService.Add(quiz);
    }

    @GetMapping("/getall")
    public List<Quiz> get()
    {
        return quizService.get();
    }
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id)
    {
        return quizService.get(id);
    }
}
