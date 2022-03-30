package org.prgrms.java.gof.ch3_decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
  Beverage beverage;
  public abstract String getDescription();
}
