package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(100);

        Weapon c1Weapon = new Weapon();
        c1Weapon.setNameOfWeapon("GUN");
        c1Weapon.setTypeOfWeapon(WeaponType.FIREARM);
        boss.setWeapon(c1Weapon);

        System.out.println("Boss damage: " + boss.getDamage() + "  Boss health: " + boss.getHealth() +
                "  Boss name of weapon: " + c1Weapon.getNameOfWeapon() +
                "  Boss type of weapon:" + c1Weapon.getTypeOfWeapon());

        System.out.println("Info about boss: " + boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setNumOfArrow(50);
        skeleton1.setDamage(65);
        skeleton1.setHealth(200);
        Weapon s1Weapon = new Weapon();
        s1Weapon.setNameOfWeapon("Bomb");
        s1Weapon.setTypeOfWeapon(WeaponType.NUCLEAR);
        skeleton1.setWeapon(s1Weapon);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setNumOfArrow(80);
        skeleton2.setDamage(15);
        skeleton2.setHealth(300);
        Weapon s2Weapon = new Weapon();
        s2Weapon.setNameOfWeapon("Knife");
        s2Weapon.setTypeOfWeapon(WeaponType.SHORT_RANGE);
        skeleton2.setWeapon(s2Weapon);

        System.out.println("Info about skeleton1: " + skeleton1.printInfo() +
                "\nInfo about skeleton2: " + skeleton2.printInfo());


    }
}
