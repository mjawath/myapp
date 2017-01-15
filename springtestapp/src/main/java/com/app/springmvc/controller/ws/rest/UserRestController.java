/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.springmvc.controller.ws.rest;

import com.app.springmvc.service.UserService;
import com.mycompany.entitybase.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO PC
 */
@RestController
@RequestMapping("/ws/v1/user")
public class UserRestController extends RestWSController{
    

    private UserService userService;
    
    
    
    @RequestMapping("/test")
    protected String testRest(String txt){
        System.out.println("fetching user"); 
        userService.getByID(txt,txt);
        return "    -------   ";
    }
    
    @Autowired
    @Qualifier("userService")
    public void setService(IService service){
//        super.setService(service);
        userService = (UserService) service;
    } 
    
}
