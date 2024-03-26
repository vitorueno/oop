public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast");

        if (humidity == 100 && temperature >= 0) {
            System.out.println("Chovendo");
        } else if (humidity == 100 && temperature < 0) {
            System.out.println("Nevando");
        }

        if (temperature > 27) {
            System.out.println("Calor");
        } else if (temperature < 17) {
            System.out.println("frio");
        } else {
            System.out.println("Temperatura amena");
        }
        System.out.println("\n");
    }
}
