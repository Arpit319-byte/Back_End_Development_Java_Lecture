package org.gfg;

public abstract class TataCar implements GovtNorms,EnvNorms{


    @Override
    public String getBrand() {
        return "Tata brand";
    }

    public String getPC(){
        return  GovtNorms.super.getPC();
    };




}
