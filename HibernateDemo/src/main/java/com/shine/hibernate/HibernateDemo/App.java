package com.shine.hibernate.HibernateDemo;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        //Configurations
        File hibernatePropFile = new File("./src/main/resources/hibernate.cfg.xml");
        Configuration configuration = new Configuration().
        		configure(hibernatePropFile).
        		addAnnotatedClass(Student.class);
        
        // Session creation
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
//        insertData(session);
        updateData(session);
        saveOrUpdateData(session);
        fetchData(session);
    }
    
    static void fetchData(Session session) {
    	Transaction transaction = session.beginTransaction();
        Student std = (Student)session.get(Student.class, 10);
        System.out.println("Student record is: " + std);
        transaction.commit();    	
    }
    
    static void insertData(Session session) {
    	StudentName sName = new StudentName();
    	sName.setFirstName("Vinod");
    	sName.setLastName("Akkepalli");
    	sName.setMiddleName("Kumar");
    	Student std1 = new Student();
        std1.setName(sName);
        std1.setRollNumber(10);
        
        Transaction transaction = session.beginTransaction();
        // save for saving a record
        session.save(std1);
        transaction.commit();
    }
    
    static void updateData(Session session) {
    	StudentName sName = new StudentName();
    	sName.setFirstName("Pramod");
    	sName.setLastName("Akkepalli");
    	sName.setMiddleName("Kumar");
    	
    	Student std1 = new Student();
        std1.setName(sName);
        std1.setRollNumber(10);
        
        Transaction transaction = session.beginTransaction();
        // update for updating a record
        session.update(std1);
        transaction.commit();
    }
    
    static void saveOrUpdateData(Session session) {
    	StudentName sName = new StudentName();
    	sName.setFirstName("Bapu");
    	sName.setLastName("Akkepalli");
    	sName.setMiddleName("");
    	
    	Student std1 = new Student();
        std1.setName(sName);
        std1.setRollNumber(1);
        
        Transaction transaction = session.beginTransaction();
        // saveOrUpdate saves a new record with new primary key or updates existing data
        session.saveOrUpdate(std1);
        transaction.commit();
    }
}
