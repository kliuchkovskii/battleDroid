package com.epam.lab.models;


import java.io.Serializable;

public class Player implements Serializable{
    private static final long serialVersionUID = 1L;
    private static Player instance;
    private transient Droid droid;
    private String droidType;
    private String playerName;
    private int level;
    private int score;
    private int kills;

    private Player(String playerName,int level,int score,int kills,String droidType){
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.kills = kills;
        this.droidType = droidType;
        initDroid(droidType);
    }

    private Player(){}

    public static Player createPlayer(String droidName){
        if(instance==null){
            instance = new Player(droidName,1,0,0,"bullet_droid");
            return instance;
        }
        return instance;
    }
//
//    public static Player createPlayer(String playerName,int level,int score,int kills,String droidType){
//        if(instance==null){
//            instance = new Player(playerName, level,score,kills,droidType);
//            return instance;
//        }
//        return instance;
//    }

    public void initDroid(String droidType){
        switch (droidType){
            case "bullet_droid": setBulletDroid(); break;
            case "rocket_droid": setRocketDroid(); break;
            default:
                System.out.println("Invalid type of droid");
                break;
        }
    }

    public static Player getPlayer(){
        return instance;
    }

    public static void setPlayer(Player player){
        instance = player;
    }

    private void setBulletDroid(){
        droid = new BulletDroid();
    }

    private void setRocketDroid(){
        droid = new RocketDroid();
    }

    public Droid getDroid() {
        return droid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getDroidType() {
        return droidType;
    }
}
