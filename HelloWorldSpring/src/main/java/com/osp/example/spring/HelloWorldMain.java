package com.osp.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.osp.example.bean.HelloWorldBean;

/**
 * Hello world!
 *
 */
public class HelloWorldMain 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
    	
    	HelloWorldBean bean = (HelloWorldBean)context.getBean("helloBean");
    	
    	bean.printName();
    }
}
