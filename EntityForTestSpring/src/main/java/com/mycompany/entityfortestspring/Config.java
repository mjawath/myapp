/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entityfortestspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author LENOVO PC
 */
@Configuration
public class Config {

    @Bean
    public TestBean getTest() {
        return new TestBean();
    }

//    @Bean
//    public StandardServiceRegistry getRegistry() {
//        // A SessionFactory is set up once for an application!
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure() // configures settings from hibernate.cfg.xml
//                .build();
//
//        try {
//            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        } catch (Exception e) {
//            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
//            // so destroy it manually.
//            StandardServiceRegistryBuilder.destroy(registry);
//        }
//        return registry;
//    }

//      @Bean
//    public EntityManagerFactory getEntityManagerFactory(){
//    
//         EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPU");
//         return emf;
//        
//    }
    
}
