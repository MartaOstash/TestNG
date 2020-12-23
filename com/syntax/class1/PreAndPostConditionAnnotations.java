package com.syntax.class1;

import org.testng.annotations.*;

public class PreAndPostConditionAnnotations {

    @BeforeClass //executes once cause we're running 1 class only
    public void beforeClass(){
        System.out.println("I am before class annotation");
    }

    @Test
    public void testMethod(){
        System.out.println("I am a test method");
    }
    @Test
    public void testMethod2(){
        System.out.println("I am a test method 2");

    }
    @Test
    public void testMethod3(){
        System.out.println("I am a test method 3");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("I am after class method");
    }


}
