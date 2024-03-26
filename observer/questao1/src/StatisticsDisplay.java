import java.util.ArrayList;
import java.util.HashMap;

public class StatisticsDisplay implements Observer, DisplayElement {
    private HashMap<String, Float> statisticsTemperature = new HashMap<String, Float>();

    private ArrayList<Float> temperatures = new ArrayList<Float>();

    private HashMap<String, Float> statisticsHumidity = new HashMap<String, Float>();

    private ArrayList<Float> humidities = new ArrayList<Float>();

    private HashMap<String, Float> statisticsPressure = new HashMap<String, Float>();

    private ArrayList<Float> pressures = new ArrayList<Float>();

    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;

        WeatherData weatherData2 = (WeatherData) weatherData;

        this.statisticsTemperature.put("min", weatherData2.getTemperature());
        this.statisticsTemperature.put("max", weatherData2.getTemperature());
        this.statisticsTemperature.put("avg", weatherData2.getTemperature());
        this.temperatures.add(weatherData2.getTemperature());

        this.statisticsHumidity.put("min", weatherData2.getHumidty());
        this.statisticsHumidity.put("max", weatherData2.getHumidty());
        this.statisticsHumidity.put("avg", weatherData2.getHumidty());
        this.humidities.add(weatherData2.getHumidty());

        this.statisticsPressure.put("min", weatherData2.getPressure());
        this.statisticsPressure.put("max", weatherData2.getPressure());
        this.statisticsPressure.put("avg", weatherData2.getPressure());
        this.pressures.add(weatherData2.getPressure());

        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        updateTemperature(temperature);
        updateHumidity(humidity);
        updatePressure(pressure);

        display();
    }

    private void updateTemperature(float temperature) {
        if (temperature < this.statisticsTemperature.get("min")) {
            this.statisticsTemperature.put("min", temperature);
        }

        if (temperature > this.statisticsTemperature.get("max")) {
            this.statisticsTemperature.put("max", temperature);
        }

        this.temperatures.add(temperature);
        this.statisticsTemperature.put("avg", sumArrayList(temperatures) / this.temperatures.size());
    }

    private void updateHumidity(float humidity) {
        if (humidity < this.statisticsHumidity.get("min")) {
            this.statisticsHumidity.put("min", humidity);
        }

        if (humidity > this.statisticsHumidity.get("max")) {
            this.statisticsHumidity.put("max", humidity);
        }

        this.humidities.add(humidity);
        this.statisticsHumidity.put("avg", sumArrayList(humidities) / this.humidities.size());
    }

    private void updatePressure(float pressure) {
        if (pressure < this.statisticsPressure.get("min")) {
            this.statisticsPressure.put("min", pressure);
        }

        if (pressure > this.statisticsPressure.get("max")) {
            this.statisticsPressure.put("max", pressure);
        }

        this.pressures.add(pressure);
        this.statisticsPressure.put("avg", sumArrayList(pressures) / this.pressures.size());
    }

    private float sumArrayList(ArrayList<Float> arrayList) {
        float sum = 0;
        for (Float number : arrayList) {
            sum += number;
        }
        return sum;
    }

    @Override
    public void display() {
        System.out.println("Temperatura mínima: " + this.statisticsTemperature.get("min"));
        System.out.println("Temperatura máxima: " + this.statisticsTemperature.get("max"));
        System.out.println("Temperatura média: " + this.statisticsTemperature.get("avg"));
        System.out.println("Humidade mínima: " + this.statisticsHumidity.get("min"));
        System.out.println("Humidade máxima: " + this.statisticsHumidity.get("max"));
        System.out.println("Humidade média: " + this.statisticsHumidity.get("avg"));
        System.out.println("Pressão mínima: " + this.statisticsPressure.get("min"));
        System.out.println("Pressão máxima: " + this.statisticsPressure.get("max"));
        System.out.println("Pressão média: " + this.statisticsPressure.get("avg") + "\n");
    }
}
