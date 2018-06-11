package cz.inventi.academy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("src/main/resources/context.xml");

        Hello obj = (Hello) context.getBean("hello");
        obj.sayHello();
        ((FileSystemXmlApplicationContext) context).destroy();
    }
}
