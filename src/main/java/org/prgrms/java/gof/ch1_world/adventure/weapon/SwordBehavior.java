package org.prgrms.java.gof.ch1_world.adventure.weapon;

public class SwordBehavior implements WeaponBehavior {
  @Override
  public void useWeapon() {
    System.out.println("검을 휘들렀다.");
  }
}
