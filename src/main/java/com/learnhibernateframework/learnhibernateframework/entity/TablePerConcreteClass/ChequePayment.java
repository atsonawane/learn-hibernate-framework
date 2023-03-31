package com.learnhibernateframework.learnhibernateframework.entity.TablePerConcreteClass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class ChequePayment extends Payment {
    @Column
    private String chtype;
}
