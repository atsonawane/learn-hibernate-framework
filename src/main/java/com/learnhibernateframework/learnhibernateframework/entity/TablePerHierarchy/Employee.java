package com.learnhibernateframework.learnhibernateframework.entity.TablePerHierarchy;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
}
