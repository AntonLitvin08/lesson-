package com.company.Level_9;

package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Гласные и согласные
*/

public class Solution {
  public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine().replaceAll("\\s+", "");

    char[] bool = name.toCharArray();


    for (int i = 0; i < bool.length; i++) {
      if (isVowel(bool[i])) {
        System.out.print(bool[i]);
        System.out.print(" ");
      }
    }
    System.out.println();
    for (int y = 0; y < bool.length; y++) {
      if (!isVowel(bool[y])) {
        System.out.print(bool[y]);
        System.out.print(" ");
      }
    }
  }
  //напишите тут ваш код

  // метод проверяет, гласная ли буква
  public static boolean isVowel(char c) {

    c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

    for (char d : vowels)   // ищем среди массива гласных
    {
      if (c == d)
        return true;
    }
    return false;
  }

