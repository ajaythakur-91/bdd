package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleHomePage {

    private WebDriver driver;

    private By seachBox = By.name("q");
    private By suggetionList = By.xpath("//div[@class='mkHrUc']//li//div[@class='lnnVSe']//div[@class='wM6W7d']/span");

    public GoogleHomePage (WebDriver driver){
        this.driver= driver;
    }

    public String pageTitle(){
        return driver.getTitle();
    }
    public int searachFunction(String keyword){
        driver.findElement(seachBox).clear();
        driver.findElement(seachBox).sendKeys(keyword);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> element= wait.until(ExpectedConditions.numberOfElementsToBe(suggetionList,10));
        return element.size();

    }


}
