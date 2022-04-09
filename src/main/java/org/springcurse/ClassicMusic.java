package org.springcurse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicMusic implements Music {

    private List<String> listMusic = Arrays.asList("Hungarian Rhapsody", "Moon Sonata", "Shestakovich");

    public List<String> getList(){
        return listMusic;
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
