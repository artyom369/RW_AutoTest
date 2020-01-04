package com.autotest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class mySetup extends WebDriverSettings {

    @Test
    public void createCommunityGroup() {

        loginAsSuperAdmin();

            // Create community group
        driver.get("https://feature-art.rallyware.com/management/community_group");
        //driver.findElement(By.linkText("Create community group")).click();
        driver.findElement(By.cssSelector(".controls__item")).click();
        driver.findElement(By.id("community_group_title")).sendKeys("Art Community Group");
        driver.findElement(By.id("community_group_description")).sendKeys("Test");
        driver.findElement(By.id("community_group_sortOrder")).clear();
        driver.findElement(By.id("community_group_sortOrder")).sendKeys("1");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Scroll to element
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector(".btn.btn-primary")));
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();


    }

    @Test
    public void createCommunity() {

        loginAsSuperAdmin();

        // Create community
        driver.get("https://feature-art.rallyware.com/management/communities");
        driver.findElement(By.cssSelector(".controls__item")).click();
        driver.findElement(By.id("community_title")).sendKeys("Art Community");

        driver.findElement(By.id("community_description_ifr")).sendKeys(" Test");

    }

}
