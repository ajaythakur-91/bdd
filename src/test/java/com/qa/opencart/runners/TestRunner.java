package com.qa.opencart.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

                features = "src/test/resources/features",     // path to feature files
                glue = {"com.qa.opencart.steps", "com.qa.opencart.hooks"},          // step def & hooks packages
                plugin = {
                        "pretty",
                        "html:target/cucumber-reports/report.html",
                        "json:target/cucumber-reports/report.json",
                        "junit:target/cucumber-reports/report.xml"
                },
                monochrome = true,
                dryRun = false
                //tags = "@smoke"   // change tag as needed

)


public class TestRunner {
}
