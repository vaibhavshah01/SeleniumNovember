package com.test;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class ExceptionTimeOutTest
{
    @Test(timeOut = 2000)
    public void infiniteLoopTest()
    {
        int i=1;
        while (i==1)
        {
            System.out.println(i);
        }
    }
}
