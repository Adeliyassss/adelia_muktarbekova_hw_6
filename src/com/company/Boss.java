package com.company;

public class Boss extends GameEntity{
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Damage: " + this.getDamage() + "  Health: " + this.getHealth() +
                "  Name of weapon: " + getWeapon().getNameOfWeapon() +
                "  Type of weapon:" + getWeapon().getTypeOfWeapon();
    }

}
