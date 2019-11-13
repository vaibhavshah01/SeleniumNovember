package com.test;

import org.testng.annotations.Test;

public class ExpectedExceptionsTest
{
    @Test(expectedExceptions = ArithmeticException.class)
    public void divison()
    {
        int i = 9/0;
    }
}
