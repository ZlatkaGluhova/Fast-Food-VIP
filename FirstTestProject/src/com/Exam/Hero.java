package com.Exam;

public class Hero {
    private String name;
    private int hitPoints;
    private int manaPoints;

    public Hero() {
    }

    public Hero(int hitPoints, int manaPoints) {

        this.hitPoints = hitPoints;
        this.manaPoints = manaPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int healing(int heal) {
        int hp = hitPoints + heal;
        if (hp <= 100) {
            this.hitPoints = hp;
            return heal;
        } else {
            int totalHeal = 100 - hitPoints;
            this.hitPoints = 100;
            return totalHeal;
        }
    }

    public int rechargingMP(int recharge) {
        int mp = manaPoints + recharge;
        if (mp <= 200) {
            this.manaPoints = mp;
            return recharge;
        } else {
            int totalRecharge = 200 - manaPoints;
            this.manaPoints = 200;
            return totalRecharge;
        }
    }

    public int castSpell(int reducedMP) {
        if (manaPoints >= reducedMP) {
            manaPoints -= reducedMP;
            return manaPoints;
        } else {
            return -1;
        }
    }

    public int takingDamage(int damage) {
        int leftHP = hitPoints - damage;
        if (leftHP > 0) {
            hitPoints = leftHP;
        } else {
            hitPoints = 0;
        }
        return hitPoints;
    }
}
