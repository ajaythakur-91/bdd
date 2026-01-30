package com.qa.opencart.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private WebDriver driver;

    public WebDriver initDriver(String browserName){
        System.out.println("Launching browser : "+browserName);

        switch (browserName.trim().toLowerCase()){
            case "chrome":
                driver= new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("browser not found");
                throw  new RuntimeException("INVALID BROWSER");
        }

        driver.manage().window().maximize();
        return driver;


    }
}
