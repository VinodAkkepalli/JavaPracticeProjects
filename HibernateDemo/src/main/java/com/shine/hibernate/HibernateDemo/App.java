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
        Student std1 = new Student();
        std1.setName("Vinod");
        std1.setRollNumber(1);
        
        //Configurations
        File hibernatePropFile = new File("./src/main/resources/hibernate.cfg.xml");
        Configuration configuration = new Configuration().
        		configure(hibernatePropFile).
        		addAnnotatedClass(Student.class);
        
        // Session creation
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Transaction and commit
        Transaction transaction = session.beginTransaction();
        session.save(std1);
        transaction.commit();
    }
}
