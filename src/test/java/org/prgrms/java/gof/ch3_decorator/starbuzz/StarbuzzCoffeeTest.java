package org.prgrms.java.gof.ch3_decorator.starbuzz;

import org.junit.jupiter.api.Test;

class StarbuzzCoffeeTest {

  @Test
  void name() {
    Beverage espresso = new Espresso();
    displayCoffeeDescriptionAndCost(espresso);

    Beverage houseBlend = new HouseBlend();
    houseBlend = new Mocha(houseBlend);
    displayCoffeeDescriptionAndCost(houseBlend);
  }

  private void displayCoffeeDescriptionAndCost(Beverage beverage) {
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }
}