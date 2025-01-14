package com.example.DesignPattern.BuilderDsgnPtn;

public class Main {
    public static void main(String[] args) {

        Car car1=new Car.Builder().setCompany("BMW").setModel("M5").setPrice("3Cr").build();
        Car car2=new Car.Builder().setCompany("Audi").setModel("Q3").setPrice("2Cr").build();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }


}
