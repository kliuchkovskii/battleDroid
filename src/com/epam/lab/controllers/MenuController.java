package com.epam.lab.controllers;


import com.epam.lab.models.Player;
import com.epam.lab.view.Animation;

import java.util.Scanner;
import java.util.Timer;

public class MenuController {
    private static Scanner scanner = new Scanner(System.in);

    public static void initMenu(){
        Animation.showMenu();
        String choice = scanner.nextLine();
        switch (choice){
            case "1": startGame(); break;
            case "2": startSavedGame(); break;
            case "0": System.exit(0); break;
            default:
                System.out.println("Input error");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                initMenu();
                break;
        }
    }

    private static void startGame(){
        initPlayer();
        Thread thread = new Thread(new MyListener());
        thread.start();
        Timer timer = new Timer();
        timer.schedule(new AnimationController(),10,15);
    }

    private static void startSavedGame(){
        initSavedPlayer();
        Thread thread = new Thread(new MyListener());
        thread.start();
        Timer timer = new Timer();
        timer.schedule(new AnimationController(),10,15);
    }

    private static void initPlayer(){
        Animation.inputingPlayerName();
        String playerName = scanner.nextLine();
        Player.createPlayer(playerName);
    }

    private static void initSavedPlayer(){
        Player.setPlayer(new SaverController().readPlayer());
        Player player = Player.getPlayer();
        player.initDroid(player.getDroidType());
    }
}
