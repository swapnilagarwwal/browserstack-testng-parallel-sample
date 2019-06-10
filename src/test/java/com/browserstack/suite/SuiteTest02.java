package com.browserstack.suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.browserstack.BrowserStackTestNGTest;

public class SuiteTest02 extends BrowserStackTestNGTest {

    @Test
    public void test_02() throws Exception {
        String searchString = "Selenium";
        System.out.println("Starting to run the test for: " + searchString);
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        Assert.assertTrue(driver.getTitle().startsWith(searchString));
    }
}
