package com.learnhibernateframework.learnhibernateframework.repository;

import com.learnhibernateframework.learnhibernateframework.entity.ManyToMany.PrjEmployee;
import com.learnhibernateframework.learnhibernateframework.entity.ManyToMany.Project;
import com.learnhibernateframework.learnhibernateframework.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public class MappingDAOImpl implements MappingDAO{

    @Override
    public void saveEmployee(PrjEmployee prjEmployee) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(prjEmployee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void saveProject(Project project) {

    }
}
