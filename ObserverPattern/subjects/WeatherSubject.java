package subjects;

import observers.WeatherObserver;

public interface WeatherSubject {
    void registerObserver(WeatherObserver observer);
    void unregisterObserver(WeatherObserver observer);
    void notifyObservers();
}
