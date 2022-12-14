package com.nghia.repository;

import com.nghia.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IQuestionTypeRepository extends JpaRepository<QuestionType,Integer> {
}
