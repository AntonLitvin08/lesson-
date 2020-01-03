package com.javarush.task.task15.task1522;

public class Sun implements Planet {
  private static com.javarush.task.task15.task1522.Sun instance;

  private Sun(){}

  public static com.javarush.task.task15.task1522.Sun getInstance(){
    if (instance == null){
      instance = new com.javarush.task.task15.task1522.Sun();
    }
    return instance;
  }
}
