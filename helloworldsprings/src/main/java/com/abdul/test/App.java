package com.abdul.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-Module.xml");
        Vehicle vehicle=(Vehicle) applicationContext.getBean("vehicle");
        vehicle.run();
    }
}
