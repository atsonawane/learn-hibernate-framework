package com.learnhibernateframework.learnhibernateframework.entity.TablePerSubclass;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class TPSEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
}
