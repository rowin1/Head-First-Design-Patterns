public class Amplifier {
  String description;
  Tuner tuner;
  DvdPlayer dvd;
  CdPlayer cd;
  int volume;
  
  public Amplifier(String description) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description + " is On");
  }
  
  public void off() {
    System.out.println(description + " is Off");
  }
  
  public void setSurroundSound() {
    System.out.println(description + " Surround Sound enabled");
  }
  
  public void setStereoSound() {
    System.out.println(description + " Stereo Mode enabled");
  }
  
  public void setTuner(Tuner tuner) {
    this.tuner = tuner;
  }
  
  public void setDvd(DvdPlayer dvd) {
    this.dvd = dvd;
  }
  
  public void setCd(CdPlayer cd) {
    this.cd = cd;
  }
  
  public void setVolume(int volume) {
    this.volume = volume;
  }
}