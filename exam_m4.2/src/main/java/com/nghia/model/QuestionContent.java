package com.nghia.model;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class QuestionContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min = 5, max = 100, message = "size must from 5 to 100")
    private String title;

    @NotNull
    @Size(min = 10, max = 500, message = "size must from 10 to 500")
    private String content;

    //    @NotNull
    private String answer;

    @ManyToOne
    @JoinColumn(name = "id_question_type")
    private QuestionType questionType;

    @Column(columnDefinition = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @PastOrPresent(message = "Must be a date in the Past or in the Present")
    private LocalDate dateCreate = LocalDate.now();

    private Boolean status = false;


    public QuestionContent() {
    }

    public QuestionContent(Integer id, @NotNull @Size(min = 5, max = 100) String title, @NotNull @Size(min = 10, max = 500) String content, String answer, QuestionType questionType, LocalDate dateCreate, Boolean status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.answer = answer;
        this.questionType = questionType;
        this.dateCreate = dateCreate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
