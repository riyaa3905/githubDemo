package com.bjs.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bjs.dev.Homepage;
import com.bjs.dev.Login;



public class OrangeHrmTest {


	public static void main(String args[]) {
		// TODO Auto-generated method stub
ChromeDriver d=new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	Login l=new Login(d);
	l.typeUsername();
	l.typePassword();
	l.clickSubmitButton();
	Homepage h=new Homepage(d);
	h.clickoInc();
	
	}

}
