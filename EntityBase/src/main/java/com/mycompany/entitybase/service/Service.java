/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entitybase.service;

import com.mycompany.entitybase.dao.BaseDAO;
import java.util.List;

/**
 *
 * @author LENOVO PC
 */
public class Service<T> implements IService<T>{

   protected BaseDAO<T,Object> dao;
    
   public List<T> findAll(){
    return dao.findAll();
   }



    public T findById(Object s){    
    return (T)dao.findById(s);
    }

}
