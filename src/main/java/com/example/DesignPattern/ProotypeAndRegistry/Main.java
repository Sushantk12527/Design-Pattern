package com.example.DesignPattern.ProotypeAndRegistry;

public class Main {
    public static void main(String[] args) {
        PrototypeRegistry registry=new PrototypeRegistry();

        Car car=new Car("Car","Red","Petrol","50");
        registry.addPrototype("Car",car);
        Truck truck=new Truck("Truck","White","Diesel","80");
        registry.addPrototype("Truck",truck);


        Vehicle originalCar=registry.getPrototypes("Car");
        Vehicle originalTruck=registry.getPrototypes("Truck");


        Car clonedCar=(Car) originalCar.clone();
        clonedCar.setColor("Blue");
        clonedCar.setPrice("45");


        Truck clonedTruck=(Truck) originalTruck.clone();
        clonedTruck.setFuelType("Electric");
        clonedTruck.setPrice("90");

        System.out.println("originalCar : " + originalCar.toString() );
        System.out.println("clonedCar : " + clonedCar.toString() );
        System.out.println();
        System.out.println("originalTruck : " + originalTruck.toString() );
        System.out.println("clonedTruck : " + clonedTruck.toString() );



    }
}
