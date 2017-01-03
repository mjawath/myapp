/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entityfortestspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author AJawath
 */
public class XMLConfigTester {
    
    public static void test() {
         System.out.println("start of application");
        ApplicationContext context = new ClassPathXmlApplicationContext("Configs/Beans.xml");        //FileSystemXmlApplicationContext can be also used its a file system based context loader        
         TestBean bean = (TestBean) context.getBean("helloBean");
         bean.print();
    }
}
