package com.sptringboot.springboottest2.yaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {


    @Autowired
    Person  person;

    @RequestMapping("/")
    public  Person person(){
        return  person;
    }
}
