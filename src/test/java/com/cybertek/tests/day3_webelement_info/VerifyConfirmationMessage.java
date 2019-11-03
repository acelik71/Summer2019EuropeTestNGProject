package com.cybertek.tests.day3_webelement_info;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputbox = driver.findElement((By.name("email")));

        String expectedEmail= "test@testmail.com";

        emailInputbox.sendKeys(expectedEmail);

        String actualEmail= emailInputbox.getAttribute("value");


        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        //clicking web element
        retrievePasswordButton.click();

        //verify confirmation message

        String expectedMessage = "Your e-mail's been sent!";

        WebElement messageElement = driver.findElement(By.name("confirmation_message"));

        String actualMessage = messageElement.getText();

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualMessage);
            System.out.println("expectedUrl = " + expectedMessage);
        }

        //close the browser

        driver.quit();



    }
}
