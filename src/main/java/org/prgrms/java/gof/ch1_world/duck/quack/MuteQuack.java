package org.prgrms.java.gof.ch1_world.duck.quack;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<<쉿! 🤫>>");
  }
}
