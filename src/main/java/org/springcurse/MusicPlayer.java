package org.springcurse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;


public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public void playMusic(){
        int choice = new Random().nextInt(2);
        System.out.println("Player name: " + musicList.get(choice).getSong());
    }

}
