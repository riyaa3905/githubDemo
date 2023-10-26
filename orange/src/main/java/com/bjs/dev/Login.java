package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login {
ChromeDriver driver;
 By unXpath=By.xpath("//input[@name='username']");
By pwXpath=By.xpath("//input[@name='password']");
By submitButtonXpath=By.xpath("//button[@type='submit']");

public Login(ChromeDriver driver) {
	// TODO Auto-generated constructor stub
this.driver=driver;
}
public void typeUsername()
{
	driver.findElement(unXpath).sendKeys("Admin");
}
public void typePassword()
{
	driver.findElement(pwXpath).sendKeys("admin123");
}
public void clickSubmitButton()
{
	driver.findElement(submitButtonXpath).click();
}


}
