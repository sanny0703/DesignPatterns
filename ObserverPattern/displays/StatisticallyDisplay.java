package displays;

import observers.WeatherObserver;
import subjects.WeatherSubject;

import java.util.ArrayDeque;
import java.util.Queue;

public class StatisticallyDisplay implements WeatherDisplay, WeatherObserver {
    private final StatisticsUtil temperatureUtil;
    private final StatisticsUtil humidityUtil;
    private final StatisticsUtil pressureUtil;

    private final WeatherSubject weatherSubject;

    public StatisticallyDisplay(WeatherSubject subject) {
        temperatureUtil = new StatisticsUtil();
        humidityUtil = new StatisticsUtil();
        pressureUtil = new StatisticsUtil();
        weatherSubject = subject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(" temperature{ min: " + temperatureUtil.min +
                ",max: " + temperatureUtil.max +
                ",average: " + temperatureUtil.average + "}," +
                "humidity{ min: " + humidityUtil.min +
                ",max: " + humidityUtil.max +
                ",average: " + humidityUtil.average + "}," +
                "pressure{ min: " + pressureUtil.min +
                ",max: " + pressureUtil.max +
                ",average: " + pressureUtil.average + "}}");
    }

    private void updateUtils(StatisticsUtil util, float latestData) {
        if (util.queue == null)
            util.queue = new ArrayDeque<>();
        util.queue.offer(latestData);
        util.average = getAverage(util.queue);
        if (util.min > latestData || util.min == 0.0f)
            util.min = latestData;
        if (util.max < latestData || util.max == 0.0f)
            util.max = latestData;

    }

    public float getAverage(Queue<Float> queue) {
        float sum = 0;
        for (float f : queue)
            sum += f;
        return sum / queue.size();
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        updateUtils(temperatureUtil, temperature);
        updateUtils(humidityUtil, humidity);
        updateUtils(pressureUtil, pressure);
        display();
    }
}
