package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9fiw\")]/button[2]";
    public static final String XPATH_REGISTRATION_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String ID_BIRTH_DAY = "day";
    public static final String ID_BIRTH_MONTH = "month";
    public static final String ID_BIRTH_YEAR = "year";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement acceptCookie = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookie.click();

        WebElement registration = driver.findElement(By.xpath(XPATH_REGISTRATION_ACCOUNT));
        registration.click();

        WebElement birthDay = driver.findElement(By.id(ID_BIRTH_DAY));
        Select selectBirthDay = new Select(birthDay);
        selectBirthDay.selectByValue("18");

        WebElement birthMonth = driver.findElement(By.id(ID_BIRTH_MONTH));
        Select selectBirthMonth = new Select(birthMonth);
        selectBirthMonth.selectByValue("2");


        WebElement birthYear = driver.findElement(By.id(ID_BIRTH_YEAR));
        Select selectBirthYear = new Select(birthYear);
        selectBirthYear.selectByValue("1988");
    }
}
