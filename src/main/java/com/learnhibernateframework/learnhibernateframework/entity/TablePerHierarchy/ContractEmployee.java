package com.learnhibernateframework.learnhibernateframework.entity.TablePerHierarchy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("ContractEmployee ")
public class ContractEmployee extends Employee {
    @Column
    private float payPerHour;
    @Column
    private String contractDuration;
}
