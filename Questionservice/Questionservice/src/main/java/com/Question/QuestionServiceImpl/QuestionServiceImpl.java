package com.Question.QuestionServiceImpl;

import com.Question.QuestionEntity.Question;
import com.Question.QuestionRepository.QuestionRepository;
import com.Question.QuestionService.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class QuestionServiceImpl  implements QuestionService {
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    private QuestionRepository questionRepository;
    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(long id) {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("question not found"));
    }
}
