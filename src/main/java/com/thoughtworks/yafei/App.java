package com.thoughtworks.yafei;

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

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringEight.xml");
        Meeting meeting = (Meeting) context.getBean("meeting");
        System.out.println(meeting.toString());
    }
}
