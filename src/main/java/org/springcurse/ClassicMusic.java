package org.springcurse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


public class ClassicMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
