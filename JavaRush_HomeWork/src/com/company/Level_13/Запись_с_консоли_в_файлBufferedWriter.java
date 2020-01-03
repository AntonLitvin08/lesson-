package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));


    while (true) {
      String fileName = reader.readLine();
      writer.write(fileName);
      writer.newLine();
      if (fileName.equals("exit")) break;
    }

    writer.close();
    reader.close();

  }
}
