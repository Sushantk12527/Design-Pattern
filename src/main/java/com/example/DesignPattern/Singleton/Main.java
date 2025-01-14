package com.example.DesignPattern.Singleton;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
    public static void main(String[] args) {
        System.out.println(Bird.getInstance());
        System.out.println(Animal.getInstance());

    }

    //Synchronized Double-Checked Locking
    public static class Bird{

        private static volatile Bird obj;
        private Bird(){
        }

        public static Bird getInstance(){
            if(obj==null){
                synchronized(Bird.class){
                    if(obj==null){
                        obj= new Bird();
                    }
                }
            }
            return obj;
        }

    }

    // Bill Pugh Singleton
    public static class Animal{

        private Animal(){}

        private static class SingletonHelper{
            private static final Animal obj= new Animal();
        }

        public static Animal getInstance(){
            return SingletonHelper.obj;
        }
    }
}
