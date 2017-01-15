/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entitybase.service;

import java.util.List;

/**
 *
 * @author LENOVO PC
 */
public interface IService<T>  {

   public List<T> findAll();



    public T findById(Object id);

}
