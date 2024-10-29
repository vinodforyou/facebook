//package com.Facebook.stepdefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import com.Facebook.runner.Testrunner;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Stepdefinition {
//
//	WebDriver driver = Testrunner.driver;
//
//	@Given("user Launched The Browser")
//	public void user_launched_the_browser() {
//
//		driver.get("https://www.facebook.com/index.php/");
//	}
//
//	@When("user Entered The Username In The Username Field")
//	public void user_entered_the_username_in_the_username_field() {
//		driver.findElement(By.id("email")).sendKeys("vijay");
//	}
//
//	@When("user Entered The Password In The Password Field")
//	public void user_entered_the_password_in_the_password_field() {
//		driver.findElement(By.id("pass")).sendKeys("vijay@222");
//	}
//
//	@Then("user Clicks The Log In Button And Its Navigate To Next Page")
//	public void user_clicks_the_log_in_button_and_its_navigate_to_next_page() {
//		driver.findElement(By.name("login")).click();
//	}
//
//}
