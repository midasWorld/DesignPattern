package org.prgrms.java.gof.ch1_world.duck.fly;

public class FlyWithWings implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("I'm flying! 🚀");
  }
}
