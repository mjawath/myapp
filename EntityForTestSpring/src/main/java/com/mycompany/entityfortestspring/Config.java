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
    

    
}
