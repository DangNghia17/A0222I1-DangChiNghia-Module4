package com.nghia.service;

import com.nghia.model.QuestionType;
import com.nghia.repository.IQuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeService implements IQuestionTypeService{
    @Autowired
    private IQuestionTypeRepository questionTypeRepository;


    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }
}
