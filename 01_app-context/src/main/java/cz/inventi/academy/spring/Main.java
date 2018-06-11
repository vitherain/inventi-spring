package cz.inventi.academy.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext
                ("src/main/resources/context.xml");

        Hello obj = (Hello) context.getBean("hello");
        obj.sayHello();
        obj = (Hello) context.getBean("hello");
        obj.sayHello();
        context.registerShutdownHook();
    }
}
