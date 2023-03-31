package com.learnhibernateframework.learnhibernateframework.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Certificate {
    @Column(nullable = false)
    private String course;
    private String duration;
}
