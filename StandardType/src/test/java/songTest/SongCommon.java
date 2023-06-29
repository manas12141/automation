package songTest;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.PlaylistPage;

public class SongCommon  {
	
	public List<String> playlist;
	
	public SongCommon(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	    playlist = new ArrayList<>();

	}
	
    PlaylistPage playlistPage = new PlaylistPage();



public void addToPlaylist(String song) {
    playlist.add(song);
}


public void playSong(String song) {
    if (playlist.contains(song)) {
        playlist.remove(song);
    }
    playlist.add(song);
    if (playlist.size() > 3) {
        playlist.remove(0);
    }
}


public List<String> getPlaylist() {
    return playlist;
}


public void playSongs() {
    


    // Play S1
    playlistPage.playSong("S1");
    playlistPage.waitForSongToLoad("S1");


    // Play S2
    playlistPage.playSong("S2");
    playlistPage.waitForSongToLoad("S2");


    // Play S3
    playlistPage.playSong("S3");
    playlistPage.waitForSongToLoad("S3");


    // Play S4
    playlistPage.playSong("S4");
    playlistPage.waitForSongToLoad("S4");


    // Play S2 again
    playlistPage.playSong("S2");
    playlistPage.waitForSongToLoad("S2");


    // Play S1 again
    playlistPage.playSong("S1");
    playlistPage.waitForSongToLoad("S1");


    // Print the final playlist
    System.out.println("Final Playlist: " + playlist);
}



}
