package com.company.Level_10;

package com.javarush.task.task10.task1011;

/*
Большая зарплата
*/

import javafx.beans.binding.StringBinding;

public class Solution {
  public static void main(String[] args) {
    String s = "Я не хочу изучать Java, я хочу большую зарплату";
    System.out.println(s);
    StringBuilder bilder = new StringBuilder(s);
    for (int i = 0; i < 39; i++){

      bilder.deleteCharAt(0);
      System.out.println(bilder);
    }
    //напишите тут ваш код
  }

}