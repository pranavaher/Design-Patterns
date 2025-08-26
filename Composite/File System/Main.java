public class Main {
  public static void main(String[] args) {
    File file1 = new File("resume.pdf", 120);
    File file2 = new File("photo.jpg", 450);
    File file3 = new File("song.mp3", 5000);
    File file4 = new File("notes.txt", 30);

    // Folders
    Folder documents = new Folder("Documents");
    Folder media = new Folder("Media");
    Folder root = new Folder("Root");

    // Build hierarchy
    documents.add(file1);
    documents.add(file4);

    media.add(file2);
    media.add(file3);

    root.add(documents);
    root.add(media);

    // Show structure
    root.showDetails();
    System.out.println("------------------------");
    documents.delete(file4);

    root.showDetails();
  }
}
