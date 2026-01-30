package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

    private WebDriver driver;

    public GoogleHomePage (WebDriver driver){
        this.driver= driver;
    }

    public String pageTitle(){
        return driver.getTitle();
    }
}
