/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entityfortestspring;

import com.entity.MicroMarket;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author AJawath
 */
public class JavaConfigTester {

    private static AnnotationConfigApplicationContext annotationContext;

    public static void init() {
        annotationContext = new AnnotationConfigApplicationContext(Config.class);
        TestBean bean2 = annotationContext.getBean(TestBean.class);
        bean2.print();
        MicroMarket c = new MicroMarket();
        c.setZipCode(String.valueOf(new Date())+Math.random());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        emf.close();
        System.out.println("end of termition");

    }
    
    
}
