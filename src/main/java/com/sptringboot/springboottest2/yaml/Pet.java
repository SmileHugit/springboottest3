package com.sptringboot.springboottest2.yaml;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@ToString
@Component
public class Pet {
    private String petname;
    private int   ID;
}
