package com.exam.examserver.repository;

import com.exam.examserver.models.Question;
import com.exam.examserver.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    List<Question> findByQuiz(Quiz quiz);
}
