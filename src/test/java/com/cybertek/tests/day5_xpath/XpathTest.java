package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver(("chrome"));
     //   driver.get("http://practice.cybertekschool.com/multiple_buttons");
       // driver.get("http://practice.cybertekschool.com/sign_up");

        driver.get("http://amazon.com");

        WebElement ClickCutton = driver.findElement(By.id("twotabsearchtextbox"));
        ClickCutton.sendKeys("selenium");


        WebElement search1 = driver.findElement(By.xpath("//input[@value='Go']"));
                search1.click();

        search1.click();

        //WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]"));

      //  WebElement button2 = driver.findElement(By.xpath("//button[@onclick='button2()']"));
        //button2.click();
       // WebElement homeLink = driver.findElement(By.xpath("//*[.='Sign Up']"));


       // homeLink.click();


        //h2[contains(text(), 'Sign')]
        //button[starts-with(@id, 'button')]
       // WebElement signUp = driver.findElement(By.xpath("//h2"));

    }
}
