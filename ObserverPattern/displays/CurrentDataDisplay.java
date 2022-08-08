package displays;

import observers.WeatherObserver;
import subjects.WeatherSubject;

public class CurrentDataDisplay implements WeatherDisplay, WeatherObserver {
    private float temperature;
    private float humidity;
    private float pressure;
    private final  WeatherSubject weatherSubject;
    public CurrentDataDisplay(WeatherSubject subject){
        weatherSubject = subject;
        weatherSubject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("{ Temperature : "+temperature+",humidity : "+humidity+",pressure : "+pressure+"}");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
    }

}
