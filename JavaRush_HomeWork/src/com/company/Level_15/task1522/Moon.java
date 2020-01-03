package com.javarush.task.task15.task1522;

public class Moon implements Planet {
  private static com.javarush.task.task15.task1522.Moon instance;

  private Moon(){}

  public static com.javarush.task.task15.task1522.Moon getInstance(){
    if (instance == null){
      instance = new com.javarush.task.task15.task1522.Moon();
    }
    return instance;
  }
}
