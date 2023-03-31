package com.learnhibernateframework.learnhibernateframework.util;

import com.learnhibernateframework.learnhibernateframework.entity.OneToOne.Answer;
import com.learnhibernateframework.learnhibernateframework.entity.OneToOne.Question;
import com.learnhibernateframework.learnhibernateframework.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.put(Environment.URL, "jdbc:mysql://localhost:3306/spring-boot-hibernate?useSSL=false");
                properties.put(Environment.USER, "root");
                properties.put(Environment.PASS, "root");
                properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                properties.put(Environment.SHOW_SQL, "true");
                properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                properties.put(Environment.HBM2DDL_AUTO, "update");
                configuration.setProperties(properties);
                configuration.addAnnotatedClass(Student.class);
                configuration.addAnnotatedClass(Question.class);
                configuration.addAnnotatedClass(Answer.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
