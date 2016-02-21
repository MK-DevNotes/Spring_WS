package com.osp.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.osp.example.bean.HelloWorldBean;

/**
 * Hello world!
 *
 * @author muthukumar thangavinayagam
 *
 */
public class HelloWorldMain 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
    	
    	HelloWorldBean bean = (HelloWorldBean)context.getBean("helloBean");
    	
    	bean.printName();
    }
}
