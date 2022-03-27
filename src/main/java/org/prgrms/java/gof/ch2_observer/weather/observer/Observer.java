package org.prgrms.java.gof.ch2_observer.weather.observer;

public interface Observer {
  void update(float temperature, float humidity, float pressure);
}
