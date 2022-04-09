package org.springcurse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> listMusic = Arrays.asList("AC/DC", "System of Down", "Maximum Hardcore");

    public List<String> getList(){
        return listMusic;
    }

    @Override
    public String getSong(){
        return "AC/DC";
    }
}
