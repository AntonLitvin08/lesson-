package com.company.Level_7;

import java.util.ArrayList;

public class Solution {
  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<String>();
    list.add("роза"); // 0
    list.add("лоза"); // 1
    list.add("лира"); // 2
    list = fix(list);

    for (String s : list) {
      System.out.println(s);
    }
  }

  public static ArrayList<String> fix(ArrayList<String> list) {
    for (int i = list.size() - 1; i >=0; i--) {
      if (list.get(i).contains("р") && !list.get(i).contains("л")) {
        list.remove(i);
      }
      else if (list.get(i).contains("л") && !list.get(i).contains("р")) {
        list.add(i +1, (list.get(i)));
      }
    }
    return list;
  }
}
