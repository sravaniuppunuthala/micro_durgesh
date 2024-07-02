package com.Question.QuestionService;

import com.Question.QuestionEntity.Question;

import java.util.List;

public interface QuestionService {
    Question create(Question question);
    List<Question> get();
    Question getOne(long id);


    }
