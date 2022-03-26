package org.prgrms.java.gof.ch1_world.duck;

import org.junit.jupiter.api.Test;

class MallardDuckTest {

  @Test
  void 동작확인() {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
  }
}