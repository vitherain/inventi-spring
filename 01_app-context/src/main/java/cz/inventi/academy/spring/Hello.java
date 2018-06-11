package cz.inventi.academy.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hello.class);

    private String name;

    public void setName(final String name) {
        this.name = name;
    }

    public void sayHello() {
        LOGGER.info("Hello " + this.name);
    }

    public void destroy() {
        LOGGER.info("Goodbye!");
    }
}
