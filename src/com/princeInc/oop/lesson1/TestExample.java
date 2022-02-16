package com.princeInc.oop.lesson1;

public class TestExample {
  public static void main(String[] args) {
    int value = 10;
    int[] values = {value, 15,16,17};
    printArray(values);
  }

  private static void printArray(int[] values) {
    for (int i: values){
      System.out.println(i);
    }
  }
}