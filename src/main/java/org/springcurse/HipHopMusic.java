package org.springcurse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class HipHopMusic implements Music{

    private List<String> listMusic = Arrays.asList("Dirty Humble - \"Fat Cat\"", "50cent", "Xzibit-\"Alcoholic\"");

    public List<String> getList(){
        return listMusic;
    }

    @Override
    public String getSong(){
        return "Dirty Humble - \"Fat Cat\"";
    }
}
