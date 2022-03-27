package org.prgrms.java.gof.ch2_observer.weather.display;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.prgrms.java.gof.ch2_observer.weather.WeatherData;
import org.prgrms.java.gof.ch2_observer.weather.observer.Observer;

public class CurrentConditionsDisplay implements Observer, Display {
  private float temperature;
  private float humidity;
  private final WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  @Override
  public void display() {
    System.out.println("현재 상태: 온도: " + temperature + "F, 습도: " + humidity + "%");
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
      .append("temperature", temperature)
      .append("humidity", humidity)
      .toString();
  }
}
