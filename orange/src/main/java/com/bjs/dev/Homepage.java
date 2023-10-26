package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	ChromeDriver driver;
By oInc=By.xpath("//a[text()='OrangeHRM, Inc']");

public Homepage(ChromeDriver d) {
	// TODO Auto-generated constructor stub
driver=d;
}

public void clickoInc()
{
	driver.findElement(oInc).click();
}
}
