package org.prgrms.java.gof.ch1_world.adventure.weapon;

public class AxeBehavior implements WeaponBehavior {
  @Override
  public void useWeapon() {
    System.out.println("도끼를 휘둘렀다!");
  }
}
