package com.learnhibernateframework.learnhibernateframework.entity.TablePerSubclass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class TPSRegularEmployee extends TPSEmployee {
    @Column(name = "salary")
    private float salary;
    @Column(name = "bonus")
    private int bonus;
}
