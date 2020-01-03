package com.company.Level_13;

package com.javarush.task.task13.task1326;

/*
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(br.readLine())))) {
      list = new ArrayList<>();

      while (reader.ready()) {
        int num = Integer.parseInt(reader.readLine());
        if (num % 2 == 0) {
          list.add(num);
        }

      }
      Collections.sort(list);
      for (int i = 0; i < list.size(); i++) {

        System.out.println(list.get(i));
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

