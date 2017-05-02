public class Projector {
  String description;
  DvdPlayer dvdPlayer;
  
  public Projector(String description, DvdPlayer dvdPlayer) {
    this.description = description;
    this.dvdPlayer = dvdPlayer;
  }
  
  public void on() {
    System.out.println(description + " On");
  }
  
  public void off() {
    System.out.println(description + " Off");
  }
  
  public void wideScreenMode() {
    System.out.println(description + " in Widescreen Mode (16x9 Aspect Ratio)");
  }
  
  public void tvMode() {
    System.out.println(description + " in TV Mode (4x3 Aspect Ratio)");
  }
  
  public String toString() {
    return description;
  }
}
