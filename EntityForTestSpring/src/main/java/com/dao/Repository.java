/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author AJawath
 */
public class Repository {
    
    @PersistenceContext
    private  EntityManager entityManager;
    
    
    
}
