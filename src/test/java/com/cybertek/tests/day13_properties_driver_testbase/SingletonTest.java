package com.cybertek.tests.day13_properties_driver_testbase;

import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test(){

        String s1 = Singleton.getInstance();
        //100 lines of code
        String s2 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }
}
