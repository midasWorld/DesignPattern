package org.prgrms.java.gof.ch1_world.duck;

import org.prgrms.java.gof.ch1_world.duck.fly.FlyBehavior;
import org.prgrms.java.gof.ch1_world.duck.quack.QuackBehavior;

public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("모든 오리는 물에 뜹니다. 장난감도 말이죠. 😁");
  }
}
