package com.princeInc.oop.lesson7;

public class CompositionRunner {
  public static void main(String[] args) {
    RamComposition ramComposition = new RamComposition(16000);
    Ssd ssd = new Ssd(256);
    ComputerComposition computerComposition = new ComputerComposition(ramComposition, ssd);
    computerComposition.printStateComposition();
  }
}
