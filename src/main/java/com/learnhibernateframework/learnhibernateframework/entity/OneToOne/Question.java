package com.learnhibernateframework.learnhibernateframework.entity.OneToOne;

import lombok.Data;

import javax.persistence.*;


@Data
//@Entity
//@Table
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;
    @Column
    private String question;
    @OneToOne
    @JoinColumn(name = "answerId")
    private Answer answer;
}
