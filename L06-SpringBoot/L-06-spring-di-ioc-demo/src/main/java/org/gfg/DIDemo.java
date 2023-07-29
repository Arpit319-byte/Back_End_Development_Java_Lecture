package org.gfg;

public class DIDemo {

    public static void main(String[] args) {

        Car car1=new Car();
        car1.runCar();
        System.out.println(car1);

        Car car2=new Car();
        car2.setEngine(new Engine("Super",2000));
        car1.runCar();
        System.out.println(car1);

        Car car3=new Car("Swift",new Engine("Mega Power",1500));
        car1.runCar();
        System.out.println(car1);



    }



}
