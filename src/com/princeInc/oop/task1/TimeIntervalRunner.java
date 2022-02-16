package com.princeInc.oop.task1;
/**
 * 1.Создать класс, описывающий промежуток времени.
 *    Сам промежуток времени должен задаваться тремя свойствами:
 *    секундами, минутами и часами.
 *    Создать метод для получения полного количества секунд в объекте
 *    Создать два конструктора: первый принимает общее количество
 *    секунд, второй - часы, минуты и секунды по отдельности.
 *    Создать метод для вывода данных.
 * * */
public class TimeIntervalRunner {
  public static void main(String[] args) {
    TimeInterval timeInterval1 = createTimeInterval();
    timeInterval1.printTotalSecond();

    TimeInterval timeInterval2 = new TimeInterval(timeInterval1.totalSecond());
    System.out.println("\n" + timeInterval2.totalSecond());
    timeInterval1.printData();
    TimeInterval sumIntervals = timeInterval1.sum(timeInterval2);
    sumIntervals.printData();
  }

  private static TimeInterval createTimeInterval() {
    TimeInterval timeInterval1 = new TimeInterval(30,2,1);
    System.out.println(timeInterval1.totalSecond());
    return timeInterval1;
  }
}