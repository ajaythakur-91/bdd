package com.qa.opencart.hooks;

import com.qa.opencart.driverfactory.DriverFactory;
import com.qa.opencart.pages.GoogleHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;
    private DriverFactory driverFactory;
    private GoogleHomePage gPage;

    @Before
    public void setUp(){
        driverFactory = new DriverFactory();
        driver=driverFactory.initDriver("chrome");
        driver.get("https://www.google.com");

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public GoogleHomePage getGpage(){
        return gPage= new GoogleHomePage(driver);
    }
}
