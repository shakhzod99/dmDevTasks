package com.princeInc.lesson2;

public class Computer {
    int ssd = 256;
    int ram;

    Computer(){
        System.out.println("Конструктор был создан");
    }
    Computer(int newSsd){
        ssd = newSsd;
    }
    Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }

    void load(){
        System.out.println("Я загрузился");
    }

    void printState(){
        System.out.println("SSD: " + ssd);
        System.out.println("RAM: " + ram +"\n");
    }
}