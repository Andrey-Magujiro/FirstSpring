package org.springcurse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
public class Computer {
    private int id;
    private MusicPlayer player;

    //@Autowired
    public Computer(MusicPlayer player) {
        this.id = new Random().nextInt((100) + 1);
        this.player = player;
    }

    public void playMusic(){
        System.out.print("Computer id = " + id + "\t");
        //player.playMusic();
    }
}
