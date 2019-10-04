package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Autowired
    private Actor actor;

    public Movie(){}


    public Movie(Actor actor) {
        this.actor = actor;

    }

    public void showDetails()
    {
        System.out.println("Actor name is " + actor.getName() + " Actor age is " + actor.getAge() + " Actor gender is " + actor.getGender());
    }

}
