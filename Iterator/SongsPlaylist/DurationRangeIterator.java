import java.util.List;

public class DurationRangeIterator implements ISongIterator {
  private List<Song> songs;
  private int currentIndex;
  private int minDuration;
  private int maxDuration;

  public DurationRangeIterator(List<Song> songs, int minDuration, int maxDuration) {
    this.songs = songs;
    this.currentIndex = 0;
    this.minDuration = minDuration;
    this.maxDuration = maxDuration;
  }

  private void advancedToNextValidSong() {
    while(currentIndex < songs.size()) {
      Song song = songs.get(currentIndex);
      if(isWithinDuration(song)) break;
      currentIndex++;
    }
  }

  private boolean isWithinDuration(Song song) {
    return song.getDurationInSeconds() >= minDuration && song.getDurationInSeconds() <= maxDuration;
  }

  @Override
  public boolean hasNeaxt() {
    return currentIndex < songs.size();
  }

  @Override
  public Song next() {
    if(!hasNeaxt()) return null;

    Song currentSong = songs.get(currentIndex);
    currentIndex++;
    advancedToNextValidSong();

    return currentSong;
  }

  @Override
  public Song first() {
    for(Song song : songs) {
      if(isWithinDuration(song)) {
        return song;
      }
    }
    return null;
  }
  
  @Override
  public Song last() {
    for(int i = songs.size() - 1; i >= 0; i--) {
      if(isWithinDuration(songs.get(i))) {
        return songs.get(i);
      }
    }
    return null;
  }
}
