package org.gfg;

public interface GovtNorms {

     String getRC();
     String getBrand();
     default String getPC(){
          return "Hello";
     };
     String Insurance();


}
