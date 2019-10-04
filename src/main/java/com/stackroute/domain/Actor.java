package com.stackroute.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Actor
{
    private int age;
    private String name;
    private String gender;

    public Actor(){}

    public Actor(String name, String gender, int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}