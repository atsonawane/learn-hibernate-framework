package com.learnhibernateframework.learnhibernateframework.repository;

import com.learnhibernateframework.learnhibernateframework.entity.OneToOne.Question;
import com.learnhibernateframework.learnhibernateframework.entity.Student;
import com.learnhibernateframework.learnhibernateframework.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public class StudentDAOImpl implements StudentDAO {

    @Override
    public void saveStudent(Student student) {


        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void getStudent(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //start a transaction
            transaction = session.beginTransaction();

            //get student entity using get method
            Student student = session.get(Student.class, id);
            System.out.println(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void loadStudent(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Student student = session.load(Student.class, id);
            System.out.println(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void getStudentById(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Student student = session.byId(Student.class).getReference(id);
            System.out.println(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void saveQuestion(Question question) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(question);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
