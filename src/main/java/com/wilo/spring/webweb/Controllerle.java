package com.wilo.spring.webweb;

import org.springframework.web.bind.annotation.PutMapping;

public class Controllerle {

    private String name;
    private String lastname;
    private String age;

    public Controllerle(){

    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
