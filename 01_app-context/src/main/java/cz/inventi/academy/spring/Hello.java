package cz.inventi.academy.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

//@Component
public class Hello implements DisposableBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);

    private String name;

    public void setName(final String name) {
        this.name = name;
    }

    public void sayHello() {
        LOGGER.info("Hello " + this.name);
    }

    @Override
    public void destroy() throws Exception {
        LOGGER.info("I am going to be destroyed");
    }

    public void goodbye() throws Exception {
        LOGGER.info("Goodbye");
    }
}
