package com.example.DesignPattern.ProotypeAndRegistry;

import lombok.Getter;
import lombok.Setter;

public class Truck implements Vehicle{
    private String Name;
    private String Color;
    private String FuelType;
    private String Price;

    public Truck(String name, String color, String fuelType, String price) {
        Name = name;
        Color = color;
        FuelType = fuelType;
        Price = price;
    }

    @Override
    public Vehicle clone() {
        try {
            return (Truck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported");
        }
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
    public String toString() {
        return "Truck {" +
                "Type='" + Name + '\'' +
                ", Color='" + Color + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}
