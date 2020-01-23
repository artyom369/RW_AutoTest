package com.autotest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static com.autotest.StaticVariables.managementBadge;
import static com.autotest.StaticVariables.managementTasks;


public class FirstTest extends WebDriverSettings {



    @Test
    public void testTest() {

        loginAsSuperAdmin();

        //String title = driver.getTitle();
        //Assert.assertTrue(title.equals("Climate Superstars"));


        //driver.navigate().to("https://feature-art.rallyware.com/management/tasks");
        //driver.get("https://feature-art.rallyware.com/management/badge");

            // This structure open page in new tab
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tab1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab1.get(1));
        driver.get(managementTasks);



        //driver.findElement(By.cssSelector("li.mdc-list-item[data-id=\"menu.management\"]"));
        //driver.findElement(By.cssSelector("li.mdc-list-item[data-id=\"management_menu.badges\"]")).click();

    }

    @Test
    public void managementBadges() {

        loginAsSuperAdmin();

        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        driver.get(managementBadge);
        driver.findElement(By.linkText("Create badge")).click();
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void homePage() {

        loginAsSuperAdmin();

        driver.get("https://feature-art.rallyware.com/management/badge");
        driver.manage().window().setSize(new Dimension(640, 768));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);







    }

}
