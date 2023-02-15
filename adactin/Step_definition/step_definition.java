package com.adactin.Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.Assert;

import com.maven.Base.Base_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_definition extends Base_class {
	
	@Given("user can launch the url")
	public void user_can_launch_the_url() {
		geturl("https://www.facebook.com");
	    
	}

	@When("user can enter the username in given filed")
	public void user_can_enter_the_username_in_given_filed() {
	   driver.findElement(By.id("email")).sendKeys("elava");
	}

	@When("user can enter the password in given field")
	public void user_can_enter_the_password_in_given_field() {
	    driver.findElement(By.id("pass")).sendKeys("1234");
	}

	@When("user can enter the login button")
	public void user_can_enter_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user can successfully login")
	public void user_can_successfully_login() {
	    WebElement ele = driver.findElement(null);
	    String actual = ele.getText();
	    String expected = "The password that you've entered is incorrect.Forgotten password?";
	    Assert.assertEquals(actual, expected);
	    driver.quit();
	}
}