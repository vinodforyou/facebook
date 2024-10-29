package com.Facebook.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\vijay\\eclipse-workspace\\Maven-cucumber\\Facebook1\\src\\test\\java\\com\\Facebook\\feature",
glue = "com.Facebook.stepdefinition"

)

public class Testrunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void name() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
		
	}
	@AfterClass
	public static void close() {
		driver.close();
	}
	
	
}
