package com.learnhibernateframework.learnhibernateframework.entity.OneToManyAndManyToOne;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class OTMMTOAnswer {
    @Id
    private int answerId;
    @Column
    private String answerName;
    @ManyToOne
    private OTMMTOQuestion question;
}
