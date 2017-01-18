package com.epam.lab.controllers;


import com.epam.lab.models.Player;

import java.io.*;

public class SaverController {

    public void savePlayer(Player player){
        try {
            FileOutputStream fos = new FileOutputStream("temp.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(player);
            oos.flush();
            oos.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Player readPlayer()  {
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        Player player = null;
        try {
            fis = new FileInputStream("temp.out");
            oin = new ObjectInputStream(fis);
            player = (Player) oin.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return player;
    }
}
