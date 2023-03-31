package com.learnhibernateframework.learnhibernateframework.entity.TablePerHierarchy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("RegularEmployee")
public class RegularEmployee extends Employee {
    @Column(name = "salary")
    private float salary;
    @Column(name = "bonus")
    private int bonus;
}
