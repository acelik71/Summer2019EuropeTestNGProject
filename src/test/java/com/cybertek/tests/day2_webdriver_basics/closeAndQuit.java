package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");
       Thread.sleep(3000);
       driver.close();



        driver.get("https://practice.cybertekschool.com");

        driver.get("https://www.amazon.com");
        driver.get("https://www.google.com");
        driver.close();
        driver.quit();


    }

}
