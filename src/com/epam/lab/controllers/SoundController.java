package com.epam.lab.controllers;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundController implements Runnable {
    private final static String BLASTER_SHOOT = "C:/java_workspace/battleDroid/res/sounds/blaster.aiff";
    private final static String ROCKET_SHOOT = "res/sounds/rocket.aiff";
    private final static String LIGHTSABER = "res/sounds/LSwdlgnt.aiff";

    @Override
    public void run() {
        try {
            play(BLASTER_SHOOT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play(String file) throws IOException {

        SourceDataLine line = null;

        AudioInputStream ais = null;

        byte[] b = new byte[2048];

        try {

            File f = new File(file);

            ais = AudioSystem.getAudioInputStream(f);

            AudioFormat af = ais.getFormat();

            DataLine.Info info = new DataLine.Info(SourceDataLine.class, af);

            if (!AudioSystem.isLineSupported(info)) {
                System.err.println("Line is not supported");
                System.exit(0);
            }

            line = (SourceDataLine) AudioSystem.getLine(info);

            line.open(af);

            line.start();

            int num;

            while ((num = ais.read(b)) != -1)

                line.write(b, 0, num);

            line.drain();

            ais.close();

        } catch (Exception e) {
            System.err.println(e);
        }

        line.stop();

        line.close();
    }
}
