package cz.inventi.academy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //@Bean
    public Hello hello() {
        Hello hello = new Hello();
        hello.setName("Karel");
        return hello;
    }
}
