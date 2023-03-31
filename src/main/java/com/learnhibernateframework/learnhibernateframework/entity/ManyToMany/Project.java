package com.learnhibernateframework.learnhibernateframework.entity.ManyToMany;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projectId;
    @Column
    private String projectName;
    @ManyToMany
    private List<PrjEmployee> employeeList;
}
