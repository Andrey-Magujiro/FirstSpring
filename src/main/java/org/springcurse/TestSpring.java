package org.springcurse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String [] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(Janers.HIPHOP);
        player.playMusic(Janers.ROCK);
        player.playMusic(Janers.CLASSIC);


        /*
        Computer computer = context.getBean("computer", Computer.class);
        computer.playMusic();
        */
        context.close();
    }
}
