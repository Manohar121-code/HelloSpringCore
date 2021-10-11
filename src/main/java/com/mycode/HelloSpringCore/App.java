package com.mycode.HelloSpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycode.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
        Student stu1 = (Student) appContext.getBean("studentid1");
        System.out.println(stu1.getRollNum());
        System.out.println(stu1.getName());
        
        System.out.println(stu1.getAddress().getDoorNum());
        System.out.println(stu1.getAddress().getCity());
        
        System.out.println("----------------");
        
        Student stu2 = (Student) appContext.getBean("studentid2");
        System.out.println(stu2.getRollNum());
        System.out.println(stu2.getName());
        
        System.out.println(stu2.getAddress().getDoorNum());
        System.out.println(stu2.getAddress().getCity());
        
        
        
        //singleton
        //prototype
        //request
        //global-request
        //session
        
        Student stuSecond = (Student) appContext.getBean("studentid1");
        System.out.println(stu1);
        System.out.println(stuSecond);
        
        System.out.println(stu1 == stuSecond);
        
        
        
        
        
        
    }
}
