package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String num = reader.readLine();
      if (num.equals("exit")) {
        break;//напиште тут ваш код
      }
      try {

        int n = Integer.parseInt(num);
        if (n > 0 && n < 128) {
          print((short) n);
        } else if (n <= 0 || n >= 128) {
          print((Integer) n);
        }

      } catch (Exception e) {
        try {

            print(Double.parseDouble(num));
        }
     catch(Exception b){
            print(num);
          }
        }
      }
    }

  public static void print(Double value) {
    System.out.println("Это тип Double, значение " + value);
  }

  public static void print(String value) {
    System.out.println("Это тип String, значение " + value);
  }

  public static void print(short value) {
    System.out.println("Это тип short, значение " + value);
  }

  public static void print(Integer value) {
    System.out.println("Это тип Integer, значение " + value);
  }
}
