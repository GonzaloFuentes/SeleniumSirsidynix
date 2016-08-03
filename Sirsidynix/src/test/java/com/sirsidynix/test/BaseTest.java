package com.sirsidynix.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by gpaez on 2/8/2016.
 */
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser(){
        if (driver != null){
            driver.close();
        }
    }
}
