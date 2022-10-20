package com.sptringboot.springboottest2.yaml;

import lombok.ToString;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;
import java.util.Set;
@ToString
@lombok.Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private boolean boos;
    private Data  birth;
    private  Integer age;
    private  String[] strings;
    private List  list;
    private  Map  map;
    private Set  set;
    private  Map<String,List<Pet>> mappet;
    private  Pet pet;
}
