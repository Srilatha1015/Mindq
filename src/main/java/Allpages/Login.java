package Allpages;

import org.openqa.selenium.By;

import BasePP.BaseCCC;

public class Login extends BaseCCC {
	
	static By username = By.id("email");
	static By password = By.name("pass");
	static By login = By.tagName("button");
	
	public static void Enter_Email(String Email_id) {
		driver.findElement(username).sendKeys(Email_id);
		
	}
	
	public static void Enter_password(String passwordid) {
		driver.findElement(password).sendKeys(passwordid);
		
	}
	
	public static void button_click() {
		driver.findElement(login).click();
	}
	

}
