package com.app.springmvc.controller.ws.rest;


import com.mycompany.entitybase.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws/v1")
public class RestWSController<T> {

    protected IService service;//will be setter injected
    
    @RequestMapping("/test")
    protected String testRest(String txt) {
        System.out.println("=========================rest thisngsfsdfsdf");
        return "rest test";
    }

//    @RequestMapping(value = "/testx", method = RequestMethod.POST)
    private String testRestPost(String test) {
        System.out.println("========================= post rest thisngsfsdfsdf" + test);
        return "rest post test";
    }
    
    public String get(String postQuery){
      return "";
    }
    
    public String getAll(String postQuery){
      return "";
    }
    
    public void create(String postQuery){
      
    }
    public void update(String postQuery){
    }
    
    public void delete(String postQuery){
    }
    
    
//    @Autowired
    public void setService(IService service){
        this.service=service;
    }
    
}
