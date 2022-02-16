package com.princeInc.oop.lesson9;

import com.princeInc.oop.lesson7.ComputerComposition;

public class StaticRunner {
  public static void main(String[] args) {
    new ComputerComposition(null,null);
    new ComputerComposition(null,null);
    new ComputerComposition(null,null);
    ComputerComposition computerComposition2 = new ComputerComposition(null, null);
    ComputerComposition computerComposition = new ComputerComposition(null,null);
    System.out.println(ComputerComposition.getCounter());
    Class<? extends ComputerComposition> clazz = computerComposition.getClass();
    Class<? extends ComputerComposition> clazz2 = computerComposition2.getClass();
    System.out.println(clazz == clazz2);
    System.out.println(computerComposition == computerComposition2);

  }
}
