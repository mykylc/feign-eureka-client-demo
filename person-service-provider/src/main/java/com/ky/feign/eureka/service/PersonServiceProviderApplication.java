package com.ky.feign.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenkai
 * @company 京东成都研究院-供应链
 * @dateTime 2018/9/6 下午11:32
 * @className com.ky.feign.eureka.service.PersonServiceProviderApplication
 * @description
 **/
@SpringBootApplication
@EnableEurekaClient
public class PersonServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonServiceProviderApplication.class, args);
    }
}
