package com.learnhibernateframework.learnhibernateframework.repository;

import com.learnhibernateframework.learnhibernateframework.entity.OneToOne.Question;
import com.learnhibernateframework.learnhibernateframework.entity.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentDAO {

    public void saveStudent(Student student);

    public void getStudent(int id);

    public void loadStudent(int id);

    public void getStudentById(int id);

    public void saveQuestion(Question question);
}
