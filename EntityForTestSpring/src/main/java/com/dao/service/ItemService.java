/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.service;

import com.dao.ItemRepository;
import com.mycompany.entitybase.service.Service;
import com.entity.Item;
import com.mycompany.entitybase.dao.BaseDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author LENOVO PC
 */
@org.springframework.stereotype.Service
public class ItemService extends Service<Item>{

    @Override
    public List<Item> findAll() {
       return super.findAll();
    }

    @Override
    public Item findById(Object id) {
        return super.findById(id);
    }

    @Autowired
    public void setDao(BaseDAO dao) {
        this.dao = dao;
        
    }
    
    
    
}
