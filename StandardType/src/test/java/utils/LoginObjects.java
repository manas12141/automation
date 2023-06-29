package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects {
	WebDriver driver;
	public LoginObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	    WebElement usernameInput = driver.findElement(By.id("username"));
	    WebElement passwordInput = driver.findElement(By.id("password"));
	    WebElement loginButton = driver.findElement(By.id("login-btn"));

	    
	    public void login(String username, String password) {
	        usernameInput.sendKeys(Contsant.username);
	        passwordInput.sendKeys(Contsant.password);
	        loginButton.click();
	    }

}
