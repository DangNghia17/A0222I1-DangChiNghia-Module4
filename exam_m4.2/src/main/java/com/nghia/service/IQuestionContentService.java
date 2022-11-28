package com.nghia.service;

import com.nghia.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuestionContentService {
    Page<QuestionContent> findAll(Pageable pageable);

    void save(QuestionContent questionContent);

    void delete(Integer id);

    QuestionContent findById(Integer id);

    Page<QuestionContent> searchByName(String name, Pageable pageable);
}
