package org.prgrms.java.gof.ch1_world.adventure;

import org.junit.jupiter.api.Test;
import org.prgrms.java.gof.ch1_world.adventure.weapon.AxeBehavior;
import org.prgrms.java.gof.ch1_world.adventure.weapon.SwordBehavior;

class CharacterTest {

  @Test
  void 퀸_동작확인() {
    Character queen = new Queen();
    queen.setWeapon(new SwordBehavior());
    queen.whoAmI();
    queen.useWeapon();

    queen.setWeapon(new AxeBehavior());
    queen.useWeapon();
  }
}