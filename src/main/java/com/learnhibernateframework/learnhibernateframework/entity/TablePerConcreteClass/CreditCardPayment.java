package com.learnhibernateframework.learnhibernateframework.entity.TablePerConcreteClass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class CreditCardPayment extends Payment {
    @Column
    private String cctype;
}
