package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution{
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Person person = null;
    String key = null;

    while (true) {
      key = reader.readLine();
      if ("user".equals(key))
        doWork(new Person.User());
      else if ("loser".equals(key))
        doWork(new Person.Loser());
      else if ("coder".equals(key))
        doWork(new Person.Coder());
      else if ("proger".equals(key))
        doWork(new Person.Proger());
      else
        break;
      //doWork(person); //вызываем doWork
    }
  }

  public static void doWork(Person person) {

    if (person instanceof Person.User) {
      //person = new Person.User();
      ((Person.User) person).live();

    } else if (person instanceof Person.Loser) {
      //person = new Person.Loser();
      ((Person.Loser) person).doNothing();

    } else if (person instanceof Person.Coder) {
      //person = new Person.Coder();
      ((Person.Coder) person).writeCode();

    } else if (person instanceof Person.Proger) {
      //person = new Person.Proger();
      ((Person.Proger) person).enjoy();
    }// пункт 3
  }
}
