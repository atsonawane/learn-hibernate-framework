package com.learnhibernateframework.learnhibernateframework.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "student")
@NamedQueries({
        @NamedQuery(
                name = "findStudentByName",
                query = "from Student s where s.firstName =: name"
        )
})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 50)
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Temporal(TemporalType.DATE)
    @Column
    private Date birthDate;
    @Transient
    private String gender;
    @Embedded
    private Certificate certificate;

}
