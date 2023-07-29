package org.gfg;

public interface EnvNorms {

    String getPollution();

    default String getPC(){
        return "Hello";
    };
}
