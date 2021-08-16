package com.exam.examserver.service;


import com.exam.examserver.models.Question;
import com.exam.examserver.models.Quiz;

import java.util.List;

public interface QuestionService {
    Question addQuestion(Question question);
    Question updateQuestion(Question question);
    List<Question> getQuestions();
    Question getQuestion(Long id);
    List<Question> getQuestionsOfQuiz(Quiz quiz);

}
