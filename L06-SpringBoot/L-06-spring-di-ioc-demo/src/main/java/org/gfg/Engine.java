package org.gfg;

public class Engine {

    private String name;
    private int cc;

    public Engine(String name,int cc){
        this.name=name;
        this.cc=cc;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCc(int cc){
        this.cc=cc;
    }

    public int getCc(){
        return cc;
    }
}
