package com.Question.QuestionRepository;

import com.Question.QuestionEntity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface QuestionRepository extends JpaRepository<Question,Long> {

}
