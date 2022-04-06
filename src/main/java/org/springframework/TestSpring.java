package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ClassicMusic classic = context.getBean("musicBean", ClassicMusic.class);
        System.out.println(classic.getSong());
        ClassicMusic classicTwo = ClassicMusic.getFactoryObject();
        System.out.println(classic == classicTwo ? "it's one object!": "it's different objects!");
        /*
        MusicPlayer player = context.getBean( "MusicPlayer", MusicPlayer.class);
        player.setName("Shazam");
        player.setVolume(100);
        player.playMusic();
        MusicPlayer playerTwo = context.getBean( "MusicPlayer", MusicPlayer.class);
        playerTwo.setName("PODS");
        playerTwo.setVolume(90);
        playerTwo.playMusic();
        System.out.println(player == playerTwo ? "it's one object!": "it's different objects!");
         */



        /*
        Singleton one = Singleton.getObject();
        one.setValue(15);
        Singleton two = Singleton.getObject();
        two.setValue(11);
        System.out.println("one= " + one.getVal() + "\ttwo= " + two.getVal());

         */

        context.close();
    }
}

/*
class Singleton {
    private static Singleton object = new Singleton();
    private int value;
    private Singleton(){}

    public void setValue(int val){
        value = val;
    }

    public  int getVal(){
        return value;
    }

    public static Singleton getObject(){
        return object;
    }
}
*/
