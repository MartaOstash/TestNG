package com.syntax.class1;

import org.testng.annotations.*;

public class AnnotationTask2 {
    //executes once cause now we're running 1 class only
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @Test
    public void testMethod1(){
        System.out.println("Merry");

    }
    @Test
    public void testMethod2(){
        System.out.println("Christmas");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("After class");
    }


}

