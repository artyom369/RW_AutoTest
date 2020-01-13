package com.autotest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BusinessRules extends WebDriverSettings {

    @Test
    public void busRules() {

        loginAsSuperAdmin();

        driver.get("https://feature-art.rallyware.com/management/levels");
        driver.findElement(By.cssSelector(".controls__item")).click();

        driver.findElement(By.cssSelector(".rules-title > .collapse-trigger")).click();
        driver.findElement(By.cssSelector(".add-rule-trigger")).click();
        // dropDown list
        Select selectTriggerAvatar = new Select(driver.findElement(By.cssSelector(".unchosen-trigger")));
        //selectTriggerAvatar.selectByVisibleText("[User] Avatar upload");
        selectTriggerAvatar.selectByValue("core.user.business_rule.avatar.initial_upload");

    }
}
