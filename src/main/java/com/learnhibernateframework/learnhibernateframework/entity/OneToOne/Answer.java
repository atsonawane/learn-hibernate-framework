package com.learnhibernateframework.learnhibernateframework.entity.OneToOne;

import lombok.Data;

import javax.persistence.*;

@Data
//@Entity
//@Table
public class Answer {
    @Id
    private int answerId;
    @Column
    private String answerName;
    @ManyToOne
    private Question question;
}
