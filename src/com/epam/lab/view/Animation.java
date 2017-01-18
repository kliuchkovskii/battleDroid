package com.epam.lab.view;


import java.io.IOException;

public class Animation {
    private static ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls");

    public static void showMenu(){
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\n\n\n\n");
        System.out.println("                 $$$$$$   $$$$  $$$$$$ $$$$$$ $$     $$$$$$    $$$$$  $$$$$   $$$$  $$ $$$$$");
        System.out.println("                 $$   $$ $$  $$   $$     $$   $$     $$        $$  $$ $$  $$ $$  $$ $$ $$  $$");
        System.out.println("                 $$   $$ $$  $$   $$     $$   $$     $$        $$  $$ $$  $$ $$  $$ $$ $$  $$");
        System.out.println("                 $$$$$$  $$$$$$   $$     $$   $$     $$$$$$    $$  $$ $$$$$  $$  $$ $$ $$  $$");
        System.out.println("                 $$   $$ $$  $$   $$     $$   $$     $$        $$  $$ $$$$   $$  $$ $$ $$  $$");
        System.out.println("                 $$   $$ $$  $$   $$     $$   $$     $$        $$  $$ $$ $$  $$  $$ $$ $$  $$");
        System.out.println("                 $$$$$$  $$  $$   $$     $$   $$$$$$ $$$$$$    $$$$$  $$  $$  $$$$  $$ $$$$$ \n\n");
        System.out.println("                                                   1 - Start game");
        System.out.println("                                                   2 - Continue game");
        System.out.println("                                                   0 - EXIT");
    }

    public static void showChoosingDroid(){
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\n\n\n                                   Please, choose your droid\n\n\n\n");
        System.out.println("                     1 - Bullet Droid                     2 - Rocket Droid\n");
        System.out.println("                            *****                               *****");
        System.out.println("                           *******                             *******");
        System.out.println("                          *********                           *********");
        System.out.println("                          *********                           ************");
        System.out.println("                          **********                          ************");
        System.out.println("                          *********                           *********");
        System.out.println("                          *********                           *********");
        System.out.println("                          *********                           *********");
        System.out.println("                          *********                           *********");
        System.out.println("                          *********                           *********");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void showDead(){
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\n\n\n\n");
        System.out.println("                  $$  $$  $$$$  $$  $$    $$$$  $$$$$  $$$$$$   $$$$$  $$$$$$  $$$$  $$$$$");
        System.out.println("                  $$  $$ $$  $$ $$  $$   $$  $$ $$  $$ $$       $$  $$ $$     $$  $$ $$  $$");
        System.out.println("                  $$  $$ $$  $$ $$  $$   $$  $$ $$$$$  $$$$$$   $$  $$ $$$$$$ $$  $$ $$  $$");
        System.out.println("                   $$$$$ $$  $$ $$  $$   $$$$$$ $$$$   $$$$$$   $$  $$ $$$$$$ $$$$$$ $$  $$");
        System.out.println("                      $$ $$  $$ $$  $$   $$  $$ $$ $$  $$       $$  $$ $$     $$  $$ $$  $$");
        System.out.println("                  $$$$$   $$$$   $$$$    $$  $$ $$  $$ $$$$$$   $$$$$  $$$$$$ $$  $$ $$$$$");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void inputingPlayerName(){
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\n\n\n\n\n\n\n\n                                          Please, enter your name\n                                                |");
    }
}
