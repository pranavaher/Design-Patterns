import java.time.LocalDate;

public class Song {
  private String title;
  private String artist;
  private String genre;
  private int durationInSeconds;
  private LocalDate addedDate;

  public Song(String title, String artist, String genre, int durationInSeconds, LocalDate addedDate) {
    this.title = title;
    this.artist = artist;
    this.genre = genre;
    this.durationInSeconds = durationInSeconds;
    this.addedDate = addedDate;
  }

  public String getTitle() { return title; }
  public String getArtist() { return artist; }
  public String getGenre() { return genre; }
  public int getDurationInSeconds() { return durationInSeconds; }
  public LocalDate getAddedDate() { return addedDate; }

  @Override
  public String toString() {
    return String.format("%-25s by %-20s (%2d sec)\n", title, artist, durationInSeconds);
  }
}

