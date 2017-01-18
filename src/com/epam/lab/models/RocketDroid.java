package com.epam.lab.models;


import com.epam.lab.view.RocketAnimation;

public class RocketDroid extends Droid {
    @Override
    public void strike() {
        RocketAnimation.shooting();
    }

    @Override
    public void rest() {
        RocketAnimation.resting();
    }
}
