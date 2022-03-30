package org.prgrms.java.gof.ch3_decorator.starbuzz;

public class Espresso extends Beverage {

  public Espresso() {
    description = "에스프레소";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
