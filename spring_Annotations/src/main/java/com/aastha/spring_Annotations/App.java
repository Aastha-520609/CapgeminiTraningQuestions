package com.aastha.spring_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       Samsung s = context.getBean(Samsung.class);
       s.configuration();
    }
}
