package org.prgrms.java.gof.ch1_world.duck.quack;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("꽥");
  }
}
