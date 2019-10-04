package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig
{
    @Bean
    public Actor getActor()
    {
        return new Actor("leo","male",40);
    }

    @Bean
        public Movie getmovie()
    {
        return new Movie();
    }

}
