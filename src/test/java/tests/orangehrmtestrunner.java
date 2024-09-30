package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="M:\\Selenium work\\cucumber\\src\\test\\resources\\features\\orangehrm.feature",glue="orangehrmlogin")
public class orangehrmtestrunner {

}
