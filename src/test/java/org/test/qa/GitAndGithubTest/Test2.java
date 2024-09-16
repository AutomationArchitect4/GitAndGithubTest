package org.test.qa.GitAndGithubTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test2 {
	@Test
	public void TC001() throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/login/");
	
	String currentURL=driver.getCurrentUrl();
	
	Assert.assertEquals(currentURL, "fb");
	

}}
