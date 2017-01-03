/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.springmvc.configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author AJawath
 */
public class WebApplicationListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
            //we can start the embeded db if needed        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //we can stop the embeded db if needed        
    }
    
}
