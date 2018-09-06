package com.ky.feign.eureka.client.api.domain;

/**
 * @author chenkai
 * @company 京东成都研究院-供应链
 * @dateTime 2018/9/6 下午11:07
 * @className com.ky.feign.eureka.client.api.domain.Person
 * @description
 **/
public class Person {
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
