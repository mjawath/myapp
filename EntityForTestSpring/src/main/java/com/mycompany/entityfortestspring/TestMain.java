/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entityfortestspring;

import com.dao.ItemRepository;
import com.dao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author LENOVO PC
 */
public class TestMain {   
    
    @Autowired
    ItemRepository ir;
    
    public static void main(String[] args) {    
       AnnotationConfigApplicationContext    annotationContext = new AnnotationConfigApplicationContext(Config.class,JpaConfiguration.class);

//       ItemRepository repo =annotationContext.getBean(ItemRepository.class);
//       repo.test();      
      ItemService repo =annotationContext.getBean(ItemService.class);
       repo.findAll();          
    }    
    
}
