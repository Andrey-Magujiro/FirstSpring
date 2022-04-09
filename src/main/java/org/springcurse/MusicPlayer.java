package org.springcurse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;

@Component
public class MusicPlayer {

    private List<Music> music = new ArrayList<>();

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music musicOne, @Qualifier("rockMusic")
            Music musicTwo, @Qualifier("hipHopMusic") Music musicThree){
        music.add(musicOne);
        music.add(musicTwo);
        music.add(musicThree);
    }

    public MusicPlayer(){}


    public void playMusic(Janers janer){
        switch(janer){
            case CLASSIC:
                getRandom(getMusicType(music, new ClassicMusic()));
                break;
            case ROCK:
                getRandom(getMusicType(music, new RockMusic()));
                break;
            case HIPHOP:
                getRandom(getMusicType(music, new HipHopMusic()));
                break;
            default :
                System.out.println("Ничего не игрет!");
                break;
        }
    }

    private void getRandom(List<String> list){
        int value = new Random().nextInt(2);
        System.out.println("Played now: " + list.get(value));
    }

    private List<String> getMusicType(List<Music> list, Music type){
        for(Music elem : list){
            if(elem.getClass() == type.getClass()){
                return elem.getList();
            }
        }
        return null;
    }

}
