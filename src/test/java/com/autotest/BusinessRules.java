package com.autotest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.autotest.StaticVariables.managementLevels;


public class BusinessRules extends WebDriverSettings {

    @Test
    public void busRules() {

        loginAsSuperAdmin();


        driver.get(managementLevels);
        driver.findElement(By.cssSelector(".controls__item")).click();

        // dropDown Trigger list
        driver.findElement(By.cssSelector(".rules-title > .collapse-trigger")).click();
        driver.findElement(By.cssSelector(".add-rule-trigger")).click();

        //  Trigger [System] New month
        Select selectNewMonth = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectNewMonth.selectByValue("core.common.new_month");

        //  Trigger [System] New day
        Select selectNewDay = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectNewDay.selectByValue("core.common.new_day");

        //  Trigger [Task] Task successful
        Select selectTaskSuccessful = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectTaskSuccessful.selectByValue("ext.task.completed");
        Select selectTask = new Select(driver.findElement(By.xpath("//div[@class=\"config-row\"]/select")));
        selectTask.selectByValue("89");


        //  Trigger [Task] Task failed
        Select selectTaskFailed = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectTaskFailed.selectByValue("ext.task.failed");

        // Trigger [User] Avatar upload
        Select selectTriggerAvatar = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        //selectTriggerAvatar.selectByVisibleText("[User] Avatar upload");
        selectTriggerAvatar.selectByValue("core.user.business_rule.avatar.initial_upload");

        //  Trigger [User] Custom attribute updated
        Select selectCustomAttributeUpdated = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectCustomAttributeUpdated.selectByValue("core.user.custom_attr.updated");

        //  Trigger [User] Points Awarded
        Select selectPointsAwarded = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectPointsAwarded.selectByValue("core.user.points.awarded");

        //  Trigger [Level] Level reached
        Select selectLevelReached = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectLevelReached.selectByValue("ext.level.business_rule.trigger.level_achieved");


    }

    @Test
    public void testTriggersAndConditions() {

        loginAsSuperAdmin();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        driver.get(managementLevels);
        driver.findElement(By.cssSelector(".controls__item")).click();

        // dropDown Trigger list
        driver.findElement(By.cssSelector(".rules-title > .collapse-trigger")).click();
        driver.findElement(By.cssSelector(".add-rule-trigger")).click();

        //  Trigger [Task] Task failed
        Select selectTaskSuccessful = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        selectTaskSuccessful.selectByValue("ext.task.failed");

        Select selectTask = new Select(driver.findElement(By.xpath("//div[@class=\"config-row\"]/select")));
        selectTask.selectByValue("74");

    }
}
