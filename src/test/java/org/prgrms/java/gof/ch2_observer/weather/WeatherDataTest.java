package org.prgrms.java.gof.ch2_observer.weather;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.prgrms.java.gof.ch2_observer.weather.display.CurrentConditionsDisplay;
import org.prgrms.java.gof.ch2_observer.weather.display.ForecastDisplay;
import org.prgrms.java.gof.ch2_observer.weather.display.HeatIndexDisplay;
import org.prgrms.java.gof.ch2_observer.weather.display.StatisticsDisplay;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class WeatherDataTest {

  @Test @Order(1)
  void 기상청() {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    System.out.println("---------------------------");
    weatherData.setMeasurements(82, 70, 29.2f);
    System.out.println("---------------------------");
    weatherData.setMeasurements(78, 90, 29.2f);
    System.out.println("---------------------------");

    weatherData.removeObserver(forecastDisplay);
    weatherData.setMeasurements(62, 90, 28.1f);
    System.out.println("---------------------------");
  }

  @Test @Order(2)
  void 다른_기상청() {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    System.out.println("---------------------------");
    weatherData.setMeasurements(82, 70, 29.2f);
    System.out.println("---------------------------");
    weatherData.setMeasurements(78, 90, 29.2f);
    System.out.println("---------------------------");
  }
}