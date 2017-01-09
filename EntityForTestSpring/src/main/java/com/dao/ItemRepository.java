/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Item;
import org.springframework.stereotype.Repository;

/**
 *Base dao class which acts between  spring simple jpa repositry
 * @author AJawath
 */
@Repository
public class ItemRepository extends BaseDAOSF<Item, Long>{
    
    public ItemRepository() {
        super(Item.class);
    }
    
    public void test(){
        System.out.println("test");
    }
    
}
