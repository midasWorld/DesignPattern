package org.prgrms.java.gof.ch1_world.adventure;

import org.prgrms.java.gof.ch1_world.adventure.weapon.WeaponBehavior;

public abstract class Character {
  WeaponBehavior weaponBehavior;

  public Character() {
  }

  public void setWeapon(WeaponBehavior weaponBehavior) {
    this.weaponBehavior = weaponBehavior;
  }

  public abstract void whoAmI();

  public void useWeapon() {
    weaponBehavior.useWeapon();
  }
}
