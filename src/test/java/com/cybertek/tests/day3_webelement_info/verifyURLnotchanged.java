package com.cybertek.tests.day3_webelement_info;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotchanged {

    /**
     *   Verify URL not changed
     *   open chrome
     *   go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     *   click on Retrieve password
     *   verify that url did not change
     *
     *
     */

    public static void main(String[] args) {
       //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl = driver.getCurrentUrl();


        //click on retrieve password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        String actualUrl = driver.getCurrentUrl();

        //verify that url is not changed

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //close the browser

        driver.quit();


    }

}
