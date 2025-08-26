// Composite

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
  private String name;
  private List<FileSystemComponent> children = new ArrayList<>();  

  public Folder(String name) {
    this.name = name;
  }

  public void add(FileSystemComponent component) {
    children.add(component);
  }

  public void delete(FileSystemComponent component) {
    children.remove(component);
  }
  
  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    int totalSize = 0;
    for (FileSystemComponent component : children) {
      totalSize += component.getSize();
    }
    return totalSize;
  }

  @Override
  public void showDetails() {
    System.out.println("📂 Folder: " + name + " [Total Size: " + getSize() + " KB]");
    for (FileSystemComponent component : children) {
      component.showDetails();
    }
  }
}
