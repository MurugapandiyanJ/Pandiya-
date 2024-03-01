package com.tcs.ioc.javatrainingday8;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContextcontext =
        new ClassPathXmlApplicationContext("beams.xml")
        Objectobj=contextBean("b");
        Bb=(B) obj;
        b.other();
    }
}
