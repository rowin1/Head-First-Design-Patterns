import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  Observable observable;
  private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
  
  public StatisticsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }
  
  public void update(Observable obs, Object args) {
    if (obs instanceof WeatherData) {
      WeatherData weatherData = (WeatherData)obs;
      float temp = weatherData.getTemperature();
      tempSum += temp;
      numReadings++;
      
      if (temp > maxTemp) {
        maxTemp = temp;
      }
      
      if (temp < minTemp) {
        minTemp = temp;
      }
      
      display();
    }
  }
  
  public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}