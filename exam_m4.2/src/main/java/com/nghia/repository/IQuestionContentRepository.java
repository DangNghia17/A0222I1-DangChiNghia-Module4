package com.nghia.repository;

import com.nghia.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface IQuestionContentRepository extends JpaRepository<QuestionContent,Integer> {
    Page<QuestionContent> findAllByTitleContaining(@Param("name") String name, Pageable pageable);
}
