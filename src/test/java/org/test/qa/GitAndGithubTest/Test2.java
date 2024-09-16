package org.test.qa.GitAndGithubTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void TC001() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// to load the URL

		driver.get("https://www.google.com/");

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Google");
		Thread.sleep(5000);
		driver.quit();

	}
}
