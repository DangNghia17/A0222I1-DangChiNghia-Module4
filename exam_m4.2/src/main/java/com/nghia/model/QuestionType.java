package com.nghia.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;


    @OneToMany(mappedBy = "questionType")
    private Set<QuestionContent> questionContent;


    public QuestionType() {
    }

    public QuestionType(Integer id, @NotNull String name, Set<QuestionContent> questionContent) {
        this.id = id;
        this.name = name;
        this.questionContent = questionContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<QuestionContent> getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(Set<QuestionContent> questionContent) {
        this.questionContent = questionContent;
    }
}