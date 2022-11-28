package com.nghia.service;

import com.nghia.model.QuestionContent;
import com.nghia.repository.IQuestionContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionContentService implements IQuestionContentService {
    @Autowired
    private IQuestionContentRepository questionContentRepository;

    @Override
    public Page<QuestionContent> findAll(Pageable pageable) {
        return questionContentRepository.findAll(pageable);
    }

    @Override
    public void save(QuestionContent questionContent) {
        questionContentRepository.save(questionContent);
    }

    @Override
    public void delete(Integer id) {
        questionContentRepository.deleteById(id);
    }

    @Override
    public QuestionContent findById(Integer id) {
        return questionContentRepository.findById(id).orElse(null);
    }

    @Override
    public Page<QuestionContent> searchByName(String name, Pageable pageable) {
        return questionContentRepository.findAllByTitleContaining(name,pageable);
    }
}
