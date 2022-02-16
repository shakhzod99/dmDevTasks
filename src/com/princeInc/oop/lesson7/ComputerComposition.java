package com.princeInc.oop.lesson7;

public class ComputerComposition {

  private RamComposition ram;
  private Ssd ssd;
  private static int counter = 0;

  public ComputerComposition(RamComposition ram, Ssd ssd) {
    this.ram = ram;
    this.ssd = ssd;
    counter++;
  }

  public static int getCounter() {
    return counter;
  }

  public void printStateComposition(){
    System.out.println("Computer: ram " + ram.getValue() + "\nSsd: " + ssd.getSsdValue() );
  }
}
