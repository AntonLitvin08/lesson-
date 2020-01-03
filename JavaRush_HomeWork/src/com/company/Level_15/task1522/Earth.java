package com.javarush.task.task15.task1522;

public class Earth implements Planet {
  private static com.javarush.task.task15.task1522.Earth instance;

  private Earth(){}

  public static com.javarush.task.task15.task1522.Earth getInstance(){
    if (instance == null){
      instance = new com.javarush.task.task15.task1522.Earth();
    }
    return instance;
  }
}
