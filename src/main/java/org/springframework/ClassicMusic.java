package org.springframework;

public class ClassicMusic implements Music{

    private ClassicMusic(){}

    public static ClassicMusic getFactoryObject(){
        return new ClassicMusic();
    }


    public void myInit(){
        System.out.println("Called INITIAL method for been from ClassicMusic class!");
    }

    public void myDestruct(){
        System.out.println("Called DESTRUCTION method for been from ClassicMusic class!");
    }

    public String getSong(){
        return "Moon Sonata";
    }
}
