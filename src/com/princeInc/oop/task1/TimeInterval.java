package com.princeInc.oop.task1;

public class TimeInterval {
  private static final int SECONDS_IN_MINUTE = 60;
  private static final int MINUTES_IN_HOURS = 60;

  private int seconds;
  private int minutes;
  private int hours;

  public TimeInterval(int totalSeconds){
    this.hours = totalSeconds/3600;
    this.minutes = totalSeconds%3600/60;
    this.seconds = totalSeconds%3600%60;
  }

  public TimeInterval(int seconds, int minutes, int hours) {
    this.seconds = seconds;
    this.minutes = minutes;
    this.hours = hours;
  }
  public int totalSecond(){
    return seconds + minutes*SECONDS_IN_MINUTE + hours * MINUTES_IN_HOURS * MINUTES_IN_HOURS;
  }

  public TimeInterval sum(TimeInterval second){
    return new TimeInterval(this.totalSecond() + second.totalSecond());
  }

  public void printData(){
    System.out.println("hours: "+ hours + ", minutes: " +minutes + ", seconds: " + seconds);
  }

  public void printTotalSecond(){
    System.out.println(totalSecond());
  }

  public int getSeconds() {
    return seconds;
  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }
}
