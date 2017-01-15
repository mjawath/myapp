package com.app.springmvc.service;

import com.app.springmvc.dao.UserProfileDAO;
import java.util.List;

import com.app.springmvc.model.UserProfile;
import com.mycompany.entitybase.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service("userProfileService")
@Transactional
public class UserProfileService extends Service<UserProfile>{

    public UserProfileService() {
        super();
        System.out.println("init ###############3");
    }

    
    
    @Autowired
    @Qualifier("userProfileDao")
    private UserProfileDAO dao;  
    

    public UserProfile findById(Integer id) {
        return (UserProfile) dao.findById(id);
    }

    public UserProfile findByType(String type) {
        return dao.findByType(type);
    }

    public List<UserProfile> findAll() {
        return dao.findAll();
    }
    

}
