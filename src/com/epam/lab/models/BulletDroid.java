package com.epam.lab.models;


import com.epam.lab.view.BulletAnimation;

public class BulletDroid extends Droid {
    @Override
    public void strike() {
        BulletAnimation.shooting();
    }

    @Override
    public void rest(){
        BulletAnimation.resting();
    }
}
