import displays.CurrentDataDisplay;
import displays.StatisticallyDisplay;
import subjects.WeatherObject;

/**
 * given a weather object that holds temperature,humidity and pressure variables ,and it's update method gets called,
 * automatically when there is a new data available,implement different displays like currentDataDisplay,Statistics display,climate display,
 * whenever there is a new data available,all the displays should update accordingly
 */
public class WeatherSimulator {
    public static void main(String[] args) {
        WeatherObject object = new WeatherObject();
        CurrentDataDisplay display = new CurrentDataDisplay(object);
        StatisticallyDisplay statisticallyDisplay = new StatisticallyDisplay(object);
        object.update(34.5f, 56.4f, 2.3f);
        object.update(35.5f,68.f,4.5f);


    }
}
