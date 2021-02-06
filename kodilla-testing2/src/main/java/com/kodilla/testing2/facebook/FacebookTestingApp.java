package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement acceptCookie = driver.findElement(By.id("u_0_h"));
        acceptCookie.click();

        WebElement registration = driver.findElement(By.id("u_0_2"));
        registration.click();

        WebElement birthDay = driver.findElement(By.id("day"));
        Select selectBirthDay = new Select(birthDay);
        selectBirthDay.selectByIndex(18);

        WebElement birthMonth = driver.findElement(By.id("month"));
        Select selectBirthMonth = new Select(birthMonth);
        selectBirthMonth.selectByIndex(2);

        while (!driver.findElement(By.id("birthday_wrapper")).isDisplayed());

        WebElement birthYear = driver.findElement(By.id("year"));
        Select selectBirthYear = new Select(birthYear);
        selectBirthYear.selectByIndex(20);
    }
}
