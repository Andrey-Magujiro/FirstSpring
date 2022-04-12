package org.springcurse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String [] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConfiguration.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();

        HipHopMusic hiphop1 = context.getBean("hipHopMusic", HipHopMusic.class);
        System.out.println(hiphop1.getSong());
        //HipHopMusic hiphop2 = context.getBean("hipHopMusic", HipHopMusic.class);
        //System.out.println(hiphop2.getSong());
        context.close();
    }
}
