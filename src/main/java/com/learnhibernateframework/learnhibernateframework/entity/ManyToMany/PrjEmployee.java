package com.learnhibernateframework.learnhibernateframework.entity.ManyToMany;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class PrjEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    @Column
    private String empName;
    @ManyToMany
    private List<Project> projectList;
}
