public class Stereo {
  int volume;
  String location;
  
  public Stereo(String location) {
    this.location = location;
  }
  
  public void on() {
    System.out.println(location + " Stereo is On");
  }
  
  public void off() {
    System.out.println(location + " Stereo is Off");
  }
  
  public void setCD() {
    System.out.println(location + " Stereo is set for CD input");
  }
  
  public void setDVD() {
    System.out.println(location + " Stereo is set for DVD input");
  }
  
  public void setVolume(int volume) {
    this.volume = volume;
    System.out.println(location + " Stereo Volume is set to " + volume);
  }
}
