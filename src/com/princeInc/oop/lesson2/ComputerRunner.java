package com.princeInc.oop.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();

        Computer computer2 = new Computer(1050);
        computer2.printState();

        Computer computer3 = new Computer(1050, 32);
        computer3.printState();
        computer3.load(true);
    }
}
