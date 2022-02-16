package com.princeInc.oop.lesson2;

public class Computer {
    private int ssd = 256;
    private int ram;

    public Computer(){
        System.out.println("Конструктор был создан");
    }
    Computer(int newSsd){
        ssd = newSsd;
    }
    protected Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }

    void load(){
        System.out.println("Я загрузился");
    }
    void load(boolean isOpen){
        System.out.println("Я загрузился");
        if (isOpen){
            System.out.println("Открыл крышку");
        }
    }

    void printState(){
        System.out.println("SSD: " + ssd);
        System.out.println("RAM: " + ram +"\n");
    }
}