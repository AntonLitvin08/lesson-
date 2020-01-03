package com.company.Level_10;

import java.util.ArrayList;

/*
Массив списков строк
*/

public class Solution {
  public static void main(String[] args) {
    ArrayList<String>[] arrayOfStringList = createList();
    printList(arrayOfStringList);
  }

  public static ArrayList<String>[] createList() {

    ArrayList<String>[] list = new ArrayList[3];

    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<String> list3 = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      list1.add("sadfasfa");
      list2.add("asdfasdggasfgdf");
      list3.add("dfsfdfsafasdfasfsdfas");
    }
    list[0] = list1;
    list[1] = list2;
    list[2] = list3;

    return list;
  }

  public static void printList(ArrayList<String>[] arrayOfStringList) {
    for (ArrayList<String> list : arrayOfStringList) {
      for (String s : list) {
        System.out.println(s);
      }
    }
   }
}

