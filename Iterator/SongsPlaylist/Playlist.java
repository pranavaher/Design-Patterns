import java.util.List;
import java.util.ArrayList;

public class Playlist {
  private List<Song> songs;

  public Playlist() {
    this.songs = new ArrayList<>();
  }

  public void addSong(Song song) {
    songs.add(song);
  }

  public ISongIterator createDefaultIterator() {
    return new DefaultIterator(songs);
  }
}


