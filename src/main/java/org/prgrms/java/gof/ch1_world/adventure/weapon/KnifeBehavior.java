package org.prgrms.java.gof.ch1_world.adventure.weapon;

public class KnifeBehavior implements WeaponBehavior {
  @Override
  public void useWeapon() {
    System.out.println("칼로 베었다!");
  }
}
