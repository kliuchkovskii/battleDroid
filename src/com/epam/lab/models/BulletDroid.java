package com.epam.lab.models;


import com.epam.lab.view.Animation;

public class BulletDroid extends Droid {
    @Override
    public void strike() {
        Animation.shooting();
    }

    @Override
    public void rest(){
        Animation.resting();
    }
}
