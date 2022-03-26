package org.prgrms.java.gof.ch1_world.adventure.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
  @Override
  public void useWeapon() {
    System.out.println("화살을 쏘았다.");
  }
}
