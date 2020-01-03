package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы. Слова с заглавной буквы
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();

    char[] chr = s.toCharArray();

    for (int i = 0; i < chr.length; i++) {
      Character space = chr[i];
      chr[0] = Character.toUpperCase(chr[0]);

      if (space.equals(' ')) {
        chr[i + 1] = Character.toUpperCase(chr[i + 1]);
      }
    }
    System.out.println(chr);//напишите тут ваш код
  }
}

