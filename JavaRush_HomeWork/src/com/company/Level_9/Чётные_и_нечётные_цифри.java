package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;

/*
Чётные и нечётные циферки
*/

public class Solution {

  public static int even;
  public static int odd;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<>();
    int num = Integer.parseInt(reader.readLine());


    while (num > 0) {

      int sum = num % 10;
      list.add(sum);
      num = num / 10;


      if (sum % 2 == 0) {
        even++;

      } else if (sum % 2 == 1) {
        odd++;

      }

      //System.out.println(list.get(i));
    }
    System.out.println("Even: " + even + " Odd: " + odd);


  }
}
