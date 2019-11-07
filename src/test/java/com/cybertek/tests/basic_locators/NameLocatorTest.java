package com.cybertek.tests.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("Mike.Smith@yahoo.com");

        WebElement submit = driver.findElement(By.name("wooden_spoon"));
        submit.click();

        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String actualMessage = messageElement.getText();

        String expectedMEssage = "Thank you for signing up. Click the button below to return to the home page.";

        if (actualMessage.equals(expectedMEssage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMEssage = " + expectedMEssage);
            System.out.println("actualMessage = " + actualMessage);
        }


    }
}
