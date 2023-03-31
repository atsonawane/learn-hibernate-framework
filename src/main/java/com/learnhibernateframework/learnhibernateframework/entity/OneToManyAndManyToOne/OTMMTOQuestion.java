package com.learnhibernateframework.learnhibernateframework.entity.OneToManyAndManyToOne;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class OTMMTOQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;
    @Column
    private String question;
    @OneToMany
    private List<OTMMTOAnswer> OTMMTOAnswerList;
}
