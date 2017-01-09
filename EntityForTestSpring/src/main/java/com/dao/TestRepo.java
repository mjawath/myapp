/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author LENOVO PC
 */
@Component
public class TestRepo {
    
    @Autowired
    private ItemRepository itemRepository;
    
    public void test(){
        System.out.println("-----------"+itemRepository);
    }
    
    
}
