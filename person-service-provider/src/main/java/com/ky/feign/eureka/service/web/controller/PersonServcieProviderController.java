package com.ky.feign.eureka.service.web.controller;

import com.ky.feign.eureka.client.api.domain.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkai
 * @company 京东成都研究院-供应链
 * @dateTime 2018/9/6 下午11:34
 * @className com.ky.feign.eureka.service.web.controller.PersonServcieProviderController
 * @description
 **/
@RestController
public class PersonServcieProviderController {

    @PostMapping(value = "/person/save")
    public boolean save(@RequestBody Person person) {
        return true;
    }
}
