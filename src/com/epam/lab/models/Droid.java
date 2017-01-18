package com.epam.lab.models;


public abstract class Droid {
    private int health = 100;

    public abstract void strike();

    public abstract void rest();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health > 0) {
            this.health = health;
        }else{
            this.health = 0;
        }
    }
}
