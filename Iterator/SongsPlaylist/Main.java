import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Playlist playlist = new Playlist();

    // Hollywood Pop/R&B
    playlist.addSong(new Song("Blinding Lights", "The Weeknd", "Synth-Pop", 200, LocalDate.now().minusDays(2)));
    playlist.addSong(new Song("Levitating", "Dua Lipa", "Disco-Pop", 200, LocalDate.now().minusDays(8)));
    playlist.addSong(new Song("Shape of You", "Ed Sheeran", "Pop", 237, LocalDate.now().minusDays(7)));

    // Hollywood Rock/Alternative
    playlist.addSong(new Song("Bohemian Rhapsody", "Queen", "Rock", 354, LocalDate.now().minusDays(5)));
    playlist.addSong(new Song("Smells Like Teen Spirit", "Nirvana", "Grunge", 301, LocalDate.now().minusDays(2)));

    // Bollywood Romantic/Pop
    playlist.addSong(new Song("Dil Bechara", "A.R. Rahman", "Bollywood Romantic", 252, LocalDate.now().minusDays(6)));
    playlist.addSong(new Song("Tera Ban Jaunga", "Akhil Sachdeva", "Bollywood Romantic", 220, LocalDate.now().minusDays(9)));
    playlist.addSong(new Song("Ghungroo", "Vishal & Shekhar", "Bollywood Pop", 200, LocalDate.now().minusDays(7)));

    // Bollywood Upbeat/Party
    playlist.addSong(new Song("Badtameez Dil", "Benny Dayal", "Bollywood Dance", 239, LocalDate.now().minusDays(3)));
    playlist.addSong(new Song("Kala Chashma", "Badshah, Neha Kakkar", "Bollywood Dance", 190, LocalDate.now().minusDays(4)));

    // Hollywood Hip-Hop/Rap
    playlist.addSong(new Song("God's Plan", "Drake", "Hip-Hop", 198, LocalDate.now().minusDays(6)));

    // Bollywood Classical/Fusion (optional)
    playlist.addSong(new Song("Jashn-E-Bahara", "Javed Ali", "Bollywood Classical", 310, LocalDate.now().minusDays(1)));

    ISongIterator defaultIterator = playlist.createDefaultIterator();

    System.out.println("🎵 Playing from start:");

    while(defaultIterator.hasNeaxt()) {
      System.out.print(defaultIterator.next());
    }

    System.out.println("\n⏮️ First Song: " + defaultIterator.first());
    System.out.println("⏭️ Last Song: " + defaultIterator.last());
  }
}
