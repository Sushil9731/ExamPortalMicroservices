package com.Quiz.Quiz.services;

import com.Quiz.Quiz.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {
    Quiz Add(Quiz quiz);
    List<Quiz> get();
    Quiz get(Long id);

}
