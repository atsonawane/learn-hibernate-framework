package com.learnhibernateframework.learnhibernateframework.entity.TablePerConcreteClass;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    @Column
    private float paymentAmount;
    @Column
    private Date paymentDate;
}
