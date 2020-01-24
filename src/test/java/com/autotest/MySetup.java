package com.autotest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static com.autotest.StaticVariables.*;

public class MySetup extends WebDriverSettings {

    @Test
    public void createCommunityGroup() {


        loginAsSuperAdmin();

            // Create community group
        driver.get(managementCommunityGroups);
        //driver.findElement(By.linkText("Create community group")).click();
        driver.findElement(By.cssSelector(".controls__item")).click();
        driver.findElement(By.id("community_group_title")).sendKeys("Art Community Group");
        driver.findElement(By.id("community_group_description")).sendKeys("Test");
        driver.findElement(By.id("community_group_sortOrder")).clear();
        driver.findElement(By.id("community_group_sortOrder")).sendKeys("1");

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            // Scroll to element
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector(".btn.btn-primary")));
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();


    }

    @Test
    public void createCommunity() {

        loginAsSuperAdmin();

            // Create community
        driver.get(managementCommunities);
        //driver.manage().deleteAllCookies();
        //driver.findElement(By.linkText("Create community")).click();
        driver.findElement(By.cssSelector(".controls__item")).click();
        driver.findElement(By.id("community_title")).sendKeys("Art Community");
        driver.findElement(By.id("community_description_ifr")).sendKeys(" Test");
        driver.findElement(By.id("community_communityGroup")).click();
        Select select = new Select(driver.findElement(By.id("community_communityGroup")));
        select.selectByVisibleText("Art Community Group");
        driver.findElement(By.cssSelector(".custom-check-label > .custom-item")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();


        //String bodyText = driver.findElement(By.cssSelector(".item--overflow")).getText();
        //Assert.assertTrue("Text not found!", bodyText.contains("Art Community"));

    }

    @Test
    public void createTaskProgram() {

        loginAsSuperAdmin();

            // Create task program
        driver.get(managementTasks);
        driver.findElement(By.cssSelector(".controls__item[href=“/management/task_programs”]")).click();
        driver.findElement(By.cssSelector(".controls__item")).click();
        driver.findElement(By.id("task_program_title")).sendKeys("Test");
        driver.findElement(By.id("task_program_description")).sendKeys("Test");
        driver.findElement(By.id("task_program_sortOrder")).clear();
        driver.findElement(By.id("task_program_sortOrder")).sendKeys("0");
        //driver.findElement(By.cssSelector(".form-control")).sendKeys("Art Community");
        //driver.findElement(By.cssSelector(".btn.btn-default")).click();
        driver.findElement(By.id("community-17249")).click();


    }

}
