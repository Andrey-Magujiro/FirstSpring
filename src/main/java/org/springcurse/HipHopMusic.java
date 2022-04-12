package org.springcurse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.Arrays;
import java.util.List;


public class HipHopMusic implements Music{

    @Override
    public String getSong(){
        return "Dirty Humble - \"Fat Cat\"";
    }
}
