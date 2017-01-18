package com.epam.lab.controllers;


import com.epam.lab.models.Player;

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
        increaseLevel();
    }

    public static int getEnemy(){
        return 90 + random.nextInt(100);
    }

    public void increaseLevel(){
        if(player.getScore()>2000){
            player.setLevel(2);
        }
    }
}
