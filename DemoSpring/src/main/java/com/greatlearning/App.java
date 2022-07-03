package com.greatlearning;

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
        //System.out.println( "Hello World!" );
    	ApplicationContext context =new ClassPathXmlApplicationContext("web.xml");
    	Student s=(Student)context.getBean("studentBean");
    	Student s1=(Student)context.getBean("studentBean1");
    	Employee s2=(Employee)context.getBean("employeeBean");
    	Employee s3=(Employee)context.getBean("employeeBean1");
    	
    	System.out.println(s);
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(s3);
    	
    }
}
