package com.example.DesignPattern.ProotypeAndRegistry;

import lombok.Getter;
import lombok.Setter;

public class Car implements Vehicle{
    private String Name;
    private String Color;
    private String FuelType;
    private String Price;

    public Car(String name, String color, String fuelType, String price) {
        Name = name;
        Color = color;
        FuelType = fuelType;
        Price = price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public Vehicle clone() {
        try {
            return (Car)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", Color='" + Color + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}
