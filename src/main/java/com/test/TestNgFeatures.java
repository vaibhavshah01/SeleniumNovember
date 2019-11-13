package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures
{
    @Test
    public void loginPageTest()
    {
        System.out.println("login");
        int i=9/0;
    }
    @Test(dependsOnMethods ="loginPageTest" )
    public void homePageTest()
    {
        System.out.println("homepage");
    }

}
