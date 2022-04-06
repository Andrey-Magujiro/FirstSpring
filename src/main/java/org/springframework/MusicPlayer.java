package org.springframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    //private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(){}
    /*
    public void setMusic(List<Music> list){
        musicList = list;
    }

    public void playMusic(){
        for(Music elem : musicList){
            Random randomTime = new Random();
            System.out.println("played song : " + elem.getSong());
            try{
                Thread.sleep(randomTime.nextInt(5000) + 2000);
            }
            catch(RuntimeException | InterruptedException exc){
                exc.printStackTrace();
            }

        }
    }*/



    private Music music;
    private String name;
    private int volume;


    public String getName() {return name;}

    public int getVolume(){return volume;}

    public void setMusic(Music music){
        this.music = music;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public MusicPlayer(Music music){
        this.music = music;
    }





    public void playMusic(){
        System.out.println("played song : " + music.getSong()  + "\tVOL = " + volume + "\tPlayer name: " + name);
    }

}
