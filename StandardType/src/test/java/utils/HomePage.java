package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;


    WebElement playlistLink = driver.findElement(By.id("playlist-link"));


    public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}


	public void openPlaylist() {
        playlistLink.click();
    }


}
