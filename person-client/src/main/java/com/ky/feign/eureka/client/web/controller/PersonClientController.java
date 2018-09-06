package com.ky.feign.eureka.client.web.controller;

import com.ky.feign.eureka.client.api.domain.Person;
import com.ky.feign.eureka.client.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkai
 * @company 京东成都研究院-供应链
 * @dateTime 2018/9/6 下午11:23
 * @className com.ky.feign.eureka.client.web.controller.PersonClientController
 * @description
 **/
@RestController
public class PersonClientController implements PersonService {

    @Autowired
    private PersonService personService;

    @Override
    public boolean save(@RequestBody Person person) {
        return personService.save(person);
    }
}
