package org.prgrms.java.gof.ch2_observer.weather.observer;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
