package songTest;

import org.testng.annotations.Test;

import utils.HomePage;
import utils.LoginPage;

public class SongRunnerTest extends LoginPage {
	
	@Test
	public void songTestRun() {
		
	    HomePage homePage = new HomePage(driver);
	    SongCommon songs=new SongCommon(driver);
	    
	    
	    homePage.openPlaylist();
	    songs.playSongs();
	   
	    

		
	}

}
