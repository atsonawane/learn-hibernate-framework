package com.learnhibernateframework.learnhibernateframework.entity.TablePerSubclass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class TPSContractEmployee extends TPSEmployee {
    @Column
    private float payPerHour;
    @Column
    private String contractDuration;
}
