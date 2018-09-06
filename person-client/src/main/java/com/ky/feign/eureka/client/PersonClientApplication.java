package com.ky.feign.eureka.client;

import com.ky.feign.eureka.client.api.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenkai
 * @company 京东成都研究院-供应链
 * @dateTime 2018/9/6 下午11:21
 * @className com.ky.feign.eureka.client.PersonClientApplication
 * @description
 **/
@SpringBootConfiguration
@EnableFeignClients(clients = PersonService.class)
public class PersonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonClientApplication.class, args);
    }
}
