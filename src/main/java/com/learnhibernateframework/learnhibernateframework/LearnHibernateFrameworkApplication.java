package com.learnhibernateframework.learnhibernateframework;

import com.learnhibernateframework.learnhibernateframework.entity.Certificate;
import com.learnhibernateframework.learnhibernateframework.entity.Student;
import com.learnhibernateframework.learnhibernateframework.repository.StudentDAO;
import com.learnhibernateframework.learnhibernateframework.repository.StudentDAOImpl;
import com.learnhibernateframework.learnhibernateframework.util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class LearnHibernateFrameworkApplication {

    public static void main(String[] args) {



        SpringApplication.run(LearnHibernateFrameworkApplication.class, args);

//        Question question = new Question();
//        question.setQuestion("What is Java ?");
//        Answer answer = new Answer();
//        answer.setAnswerName("Java is platform independent language");
//        Answer answer2 = new Answer();
//        answer2.setAnswerName("Java is Secure and Robust");
//        List<Answer> answerList = new ArrayList<>();
//        answerList.add(answer);
//        answerList.add(answer2);
//        question.setAnswerList(answerList);
//        studentDAO.saveQuestion(question);

//		studentDAO.getStudent(1);
//		studentDAO.loadStudent(1);
//		studentDAO.getStudentById(1);
//
//        MappingDAO mappingDAO = new MappingDAOImpl();
//        PrjEmployee prjEmployee = new PrjEmployee();
//        prjEmployee.setEmpName("Avinash");
//        Project project = new Project();
//        project.setProjectName("Library Mgmt");
//        Project project2 = new Project();
//        project2.setProjectName("Emp Mgmt");
//        List<Project> projectList = new ArrayList<>();
//        projectList.add(project);
//        projectList.add(project2);
//        prjEmployee.setProjectList(projectList);
//        mappingDAO.saveEmployee(prjEmployee);
//        save();
        runQuery();
    }

    public static void runQuery(){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();

//            Criteria criteria = session.createCriteria(Student.class);
//            criteria.setFirstResult(2);
//            criteria.setMaxResults(5);
//            criteria.add(Restrictions.gt("id",3));
//            criteria.add(Restrictions.lt("id",8));
//            criteria.addOrder(Order.desc("id"));
//            criteria.setProjection(Projections.property("firstName"));
//            List list = criteria.list();
//            Iterator iterator = list.iterator();
//            while (iterator.hasNext()){
//                System.out.println(iterator.next());
//            }

//            Query query = session.getNamedQuery("findStudentByName");
//            query.setParameter("name","Avinash7");
//            List list = query.list();
//            Iterator iterator = list.iterator();
//            while (iterator.hasNext()){
//                System.out.println(iterator.next());
//            }

            SQLQuery sqlQuery = session.createSQLQuery("select * from student");
            sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List list = sqlQuery.list();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            transaction.commit();
        } catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public static void save(){
        StudentDAO studentDAO = new StudentDAOImpl();
        for(int i=1; i<= 10; i++) {
            Student student = new Student();
            student.setFirstName("Avinash"+i);
            student.setLastName("Sonawane"+i);
            student.setEmail("avinash@gmail.com"+i);
            student.setBirthDate(new Date());
            student.setGender("male"+i);
            Certificate certificate = new Certificate();
            certificate.setCourse("Java"+i);
            certificate.setDuration(i+" months");
            student.setCertificate(certificate);
            studentDAO.saveStudent(student);
        }
    }
}
