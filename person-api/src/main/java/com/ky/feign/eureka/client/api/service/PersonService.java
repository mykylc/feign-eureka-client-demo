package com.ky.feign.eureka.client.api.service;

import com.ky.feign.eureka.client.api.domain.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author chenkai
 * @company 京东成都研究院-供应链
 * @dateTime 2018/9/6 下午11:09
 * @className com.ky.feign.eureka.client.api.service.PersonService
 * @description
 **/
@FeignClient(value = "person-service") //服务提供方的应用名称
public interface PersonService {

    @PostMapping(value = "/person/save")
    boolean save(@RequestBody Person person);
}
