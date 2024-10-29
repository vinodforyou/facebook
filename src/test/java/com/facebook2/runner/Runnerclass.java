package com.facebook2.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\vijay\\eclipse-workspace\\Maven-cucumber\\Facebook1\\src\\test\\java\\com\\Facebook\\feature\\Facebook.feature",
glue = "com.facebook2.stepdefinition")

public class Runnerclass {

	// Hybrid framework
	// annotation - junit [framework] - small framework

    public static WebDriver driver;

    @BeforeClass
	public static void browserlaunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/index.php/");

	}

    @AfterClass
	public static void close() {
		driver.close();
	}

}
