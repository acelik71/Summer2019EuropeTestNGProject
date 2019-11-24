package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the browser
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickCutton = driver.findElement(By.id("disappearing_button"));
        dontClickCutton.click();

        WebElement button3 = driver.findElement(By.id("three_button"));
        button3.click();



    }
}
