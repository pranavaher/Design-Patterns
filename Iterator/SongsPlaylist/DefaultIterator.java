import java.util.List;

public class DefaultIterator implements ISongIterator {
  private List<Song> songs;
  private int currentIndex;

  public DefaultIterator(List<Song> songs) {
    this.songs = songs;
    this.currentIndex = 0;
  }

  @Override
  public boolean hasNeaxt() {
    return currentIndex < songs.size();
  }

  @Override
  public Song next() {
    return hasNeaxt() ? songs.get(currentIndex++) : null;
  }

  @Override
  public Song first() {
    return songs.isEmpty() ? null : songs.get(0);
  }

  @Override
  public Song last() {
    return songs.isEmpty() ? null : songs.get(songs.size() - 1);
  }
}

