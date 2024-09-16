package org.test.qa.GitAndGithubTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void TC001() throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();

	// to load the URL

	driver.get("https://demo.guru99.com/test/delete_customer.php");

	//driver.switchTo().frame("iframeResult");

	driver.findElement(By.name("submit")).click();

	Alert alert = driver.switchTo().alert();
	String textonAlert = alert.getText();
	System.out.println(textonAlert);

	// alert.accept();
	// alert.accept();

	alert.dismiss();

	Thread.sleep(5000);
	driver.quit();

	}}
