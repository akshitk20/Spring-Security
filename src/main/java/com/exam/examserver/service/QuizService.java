package com.exam.examserver.service;

import com.exam.examserver.models.Quiz;

import java.util.List;

public interface QuizService {
    Quiz addQuiz(Quiz quiz);
    Quiz updateQuiz(Quiz quiz);
    List<Quiz> getQuizzes();
    Quiz getQuiz(Long id);
    void deleteQuiz(Long id);
}
