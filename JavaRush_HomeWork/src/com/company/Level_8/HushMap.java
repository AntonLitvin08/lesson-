package com.company.Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


  public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      HashMap<String, String> map = new HashMap<>();

      while (true) {
        String adress = reader.readLine();

        if (adress.isEmpty()) {
          break;
        }

        String family = reader.readLine();
        map.put(adress, family);
      }
      String x = reader.readLine();
      //read home number
      for (HashMap.Entry<String, String> newAdres : map.entrySet()) {
        String key = newAdres.getKey();
        String value = newAdres.getValue();

        if (x.equals(key)) {

          System.out.println(value);
        }
      }
    }
  }

}
