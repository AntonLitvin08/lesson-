package com.company.Level_10;

package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Количество букв
*/

public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Алфавит
    String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    char[] abcArray = abc.toCharArray();

    ArrayList<Character> alphabet = new ArrayList<Character>();
    for (int i = 0; i < abcArray.length; i++) {
      alphabet.add(abcArray[i]);

    }

    // Ввод строк
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      String s = reader.readLine();
      list.add(s.toLowerCase());
    }

    for (Character character : alphabet) {               //перебор алфавита
      int count = 0;
      for (String st : list) {                          //перебор строки ввеленой с клавиатуры
        char[] ch = st.toCharArray();                   //разбор каждой строки на массив строк
        for (Character c : ch){                         //перебор масива
          if ( character.equals(c)){
            count++;
          }
        }
      }
      System.out.println(character + " " + count);
    }

  }

}

