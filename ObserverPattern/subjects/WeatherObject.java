package subjects;

import observers.WeatherObserver;

import java.util.HashSet;
import java.util.Set;

public class WeatherObject implements WeatherSubject{
    private final  Set<WeatherObserver> observers;
    private float temperature;
    private  float  humidity;
    private  float  pressure;
    public WeatherObject(){
        observers = new HashSet<>();
    }
    // this method is called automatically when there is a new data available
    public void  update(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(WeatherObserver observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer: observers){
            observer.update(temperature,humidity,pressure);
        }
    }
}
