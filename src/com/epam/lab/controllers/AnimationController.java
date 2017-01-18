package com.epam.lab.controllers;


import com.epam.lab.models.Player;
import com.epam.lab.view.Animation;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;
import java.util.TimerTask;

public class AnimationController extends TimerTask {
    public static String animation = "resting";
    private Player player = Player.getPlayer();
    private static Random random = new Random();

    @Override
    public void run() {
        switch (animation) {
            case "resting":player.getDroid().rest();break;
            case "shooting":player.getDroid().strike();break;
            default:
                System.err.println("Animation mode error");
        }
        player.setScore(player.getScore()+1);
    }

    public static int getEnemy(){
        return 90 + random.nextInt(100);
    }
}
