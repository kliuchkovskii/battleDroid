package com.epam.lab.view;


import com.epam.lab.controllers.AnimationController;
import com.epam.lab.models.Player;

import java.io.IOException;

public class BulletAnimation {
    private static ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls");
    private static int indexEnemy = 150;
    private static int indexShoot = 0;
    private static int indexDead;

    public static void shooting(){
        if(indexEnemy>80){
            showJustShoot();
        }else{
            showKillingEnemy();
        }
    }

    public static void resting(){
        if(indexEnemy>80){
            showJustPlayer();
        }else{
            showPlayerAndEnemy();
        }
    }

    private static void showJustShoot(){
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        StringBuilder shootAnimation = new StringBuilder("");
        for(int i = 0;i < indexShoot;i++){
            shootAnimation.append(" ");
        }
        shootAnimation.append("*");
        int playerHealth = Player.getPlayer().getDroid().getHealth();
        if(playerHealth==0){
            Animation.showDead();
        }
        System.out.format(" Player : %s Health : %d Level : %d  Score : %d Kills : %d",Player.getPlayer().getPlayerName(),playerHealth,Player.getPlayer().getLevel(),Player.getPlayer().getScore(),Player.getPlayer().getKills() );
        System.out.println("   Press \" e + Enter \" to save and exit game");
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("       *****   ");
        System.out.println("      *******  ");
        System.out.println("     ********* ");
        System.out.println("     ********* ");
        System.out.println("     **********" + shootAnimation);
        System.out.println("     ********* ");
        System.out.println("     ********* ");
        System.out.println("     ********* ");
        System.out.println("     ********* ");
        System.out.println("     ********* ");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        indexShoot++;
        indexEnemy--;
    }

    private static void showKillingEnemy(){
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        StringBuilder enemyAnimation = new StringBuilder("");
        for(int i = 0; i <= indexEnemy; i++){
            enemyAnimation.append(" ");
        }
        enemyAnimation.append("*********");

        StringBuilder shootAnimation = new StringBuilder("");
        for(int i = 0;i < indexShoot;i++){
            shootAnimation.append(" ");
        }
        shootAnimation.append("*");

        StringBuilder deadAnimation = new StringBuilder("");
        indexDead = indexEnemy - indexShoot;
        for(int i = 0; i < indexDead; i++){
            deadAnimation.append(" ");
        }
        deadAnimation.append("*********");

        StringBuilder firstEnemyPart = new StringBuilder("");
        for(int i = 0; i < indexEnemy;i++){
            firstEnemyPart.append(" ");
        }
        firstEnemyPart.append("   *****");

        StringBuilder secondEnemyPart = new StringBuilder("");
        for(int i = 0; i < indexEnemy;i++){
            secondEnemyPart.append(" ");
        }
        secondEnemyPart.append("  *******");

        int playerHealth = Player.getPlayer().getDroid().getHealth();
        if(playerHealth==0){
            Animation.showDead();
        }
        System.out.format(" Player : %s Health : %d Level : %d  Score : %d Kills : %d",Player.getPlayer().getPlayerName(),playerHealth,Player.getPlayer().getLevel(),Player.getPlayer().getScore(),Player.getPlayer().getKills() );
        System.out.println("   Press \" e + Enter \" to save and exit game");
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("       *****   " + firstEnemyPart);
        System.out.println("      *******  " + secondEnemyPart);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     **********" + shootAnimation + deadAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        if(indexDead<1){
            Player player = Player.getPlayer();
            player.setKills(player.getKills()+1);
            AnimationController.animation = "resting";
            indexEnemy = AnimationController.getEnemy();
            indexShoot = 0;
        }else {
            indexEnemy--;
            indexShoot++;
        }
    }

    private static void showPlayerAndEnemy(){
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        StringBuilder enemyAnimation = new StringBuilder("");
        for(int i = 0; i <= indexEnemy; i++){
            enemyAnimation.append(" ");
        }
        enemyAnimation.append("*********");

        StringBuilder firstEnemyPart = new StringBuilder("");
        for(int i = 0; i < indexEnemy;i++){
            firstEnemyPart.append(" ");
        }
        firstEnemyPart.append("   *****");

        StringBuilder secondEnemyPart = new StringBuilder("");
        for(int i = 0; i < indexEnemy;i++){
            secondEnemyPart.append(" ");
        }
        secondEnemyPart.append("  *******");

        int playerHealth = Player.getPlayer().getDroid().getHealth();
        if(playerHealth==0){
            Animation.showDead();
        }
        System.out.format(" Player : %s Health : %d Level : %d  Score : %d Kills : %d",Player.getPlayer().getPlayerName(),playerHealth,Player.getPlayer().getLevel(),Player.getPlayer().getScore(),Player.getPlayer().getKills() );
        System.out.println("   Press \" e + Enter \" to save and exit game");
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("       *****   " + firstEnemyPart);
        System.out.println("      *******  " + secondEnemyPart);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     **********" + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("     ********* " + enemyAnimation);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        if(indexEnemy<1){
            Player player = Player.getPlayer();
            indexEnemy = AnimationController.getEnemy();
            player.getDroid().setHealth(player.getDroid().getHealth()-35);
        }else {
            indexEnemy--;
        }
    }

    private static void showJustPlayer()  {
        try {
            processBuilder.inheritIO().start().waitFor();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        int playerHealth = Player.getPlayer().getDroid().getHealth();
        if(playerHealth==0){
            Animation.showDead();
        }
        System.out.format(" Player : %s Health : %d Level : %d  Score : %d Kills : %d",Player.getPlayer().getPlayerName(),playerHealth,Player.getPlayer().getLevel(),Player.getPlayer().getScore(),Player.getPlayer().getKills() );
        System.out.println("   Press \" e + Enter \" to save and exit game");
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("       *****");
        System.out.println("      *******");
        System.out.println("     *********");
        System.out.println("     *********");
        System.out.println("     **********");
        System.out.println("     *********");
        System.out.println("     *********");
        System.out.println("     *********");
        System.out.println("     *********");
        System.out.println("     *********");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        indexEnemy--;
    }
}
