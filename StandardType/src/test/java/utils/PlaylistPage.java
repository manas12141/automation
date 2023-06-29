package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaylistPage {
	 public WebDriver driver;

	 By songListContainer = By.id("song-list");
     By songItem = By.className("song-item");


	    public void playSong(String song) {
	        // Logic to play the song on the playlist page
	            WebElement songElement = driver.findElement(By.id(song));
	            songElement.click();
	        
	    }
	   

	    public List<String> getPlaylistOrder() {
	        List<WebElement> songElements = driver.findElement(songListContainer).findElements(songItem);
	        List<String> playlistOrder = new ArrayList<>();
	        for (WebElement songElement : songElements) {
	            playlistOrder.add(songElement.getAttribute("id"));
	        }
	        return playlistOrder;
	    }

	    public void assertPlaylistOrder(List<String> expectedOrder) {
	        List<String> actualOrder = getPlaylistOrder();
	        assert actualOrder.equals(expectedOrder) : "Expected order: " + expectedOrder + ", but got: " + actualOrder;
	    }


	    public void waitForSongToLoad(String song) {
	        // Logic to wait for the song to load on the playlist page
	    }

}
