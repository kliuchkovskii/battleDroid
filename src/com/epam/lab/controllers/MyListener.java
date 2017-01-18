package com.epam.lab.controllers;


import com.epam.lab.models.Player;

import java.util.Scanner;

public class MyListener implements Runnable {
    private Scanner scanner = new Scanner(System.in);
    private Thread thread = new Thread(new SoundController());

    @Override
    public void run() {
        while(true) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "":
                    AnimationController.animation = "shooting";
                    thread.run();
                    break;
                case "e":
                    new SaverController().savePlayer(Player.getPlayer());
                    System.exit(0);break;
                default:
                    System.err.println("Unknown command");
                    break;
            }
        }
    }
}
