package BDDCucumberRunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"feature"},
                 glue = {"stepdefinition"},
                 plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},		 
                 tags="@Login",
                 monochrome = true)

public class RunnerFile extends AbstractTestNGCucumberTests{
 
}
