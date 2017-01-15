/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entitybase.dao;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author LENOVO PC
 */
public interface BaseDAO<T, ID>  {
    
    
    public List<T> findAll();
    
    
     public T findById(ID id);

    public T getOne(ID id) ;
    
    public void save(T obj);
    
    
    public void delete(T obj);

    public T getByKey(ID key) ;

    public void persist(T entity);
    
    public void update(T entity);
    
    public void remove(T entity);

}