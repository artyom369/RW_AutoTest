package com.autotest;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.autotest.StaticVariables.userHome;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/hp/Autotest/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void loginAsSuperAdmin() {

        //driver.manage().deleteAllCookies();
        driver.get(userHome);
        driver.findElement(By.id("username")).sendKeys("dev@rallyware.com");
        driver.findElement(By.id("password")).sendKeys("Banyaspaces350");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

    }

    @After
    public void close() {

        //driver.quit();

    }


}