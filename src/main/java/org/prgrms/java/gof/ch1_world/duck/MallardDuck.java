package org.prgrms.java.gof.ch1_world.duck;

import org.prgrms.java.gof.ch1_world.duck.fly.FlyWithWings;
import org.prgrms.java.gof.ch1_world.duck.quack.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("저는 물 오리입니다.");
  }
}
