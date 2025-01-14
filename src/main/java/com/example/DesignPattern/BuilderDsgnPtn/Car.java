package com.example.DesignPattern.BuilderDsgnPtn;

public class Car {
    private  String Company;
    private String Model;
    private String Price;

    public Car(String company, String model, String price) {
        Company = company;
        Model = model;
        Price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Company='" + Company + '\'' +
                ", Model='" + Model + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }

    public static class Builder {
        private  String Company;
        private String Model;
        private String Price;

        public Builder setCompany(String company){
            this.Company=company;
            return this;
        }

        public Builder setModel(String model){
            this.Model=model;
            return this;
        }

        public Builder setPrice(String price){
            this.Price=price;
            return this;
        }

        public Car build(){
            return new Car(this.Company,this.Model,this.Price);
        }
    }

}
