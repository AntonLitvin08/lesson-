package com.javarush.task.task08.task0824;

/*
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
  public static void main(String[] args) {


    ArrayList<Human> children = new ArrayList<>();
    Human sun1 = new Human("Anton", true, 13);
    Human sun2 = new Human("Misha", true, 4);
    Human sun3 = new Human("Maks", true, 7);
    children.add(sun1);
    children.add(sun2);
    children.add(sun3);

    ArrayList<Human> parents = new ArrayList<>();
    Human mather = new Human("Olia", false, 40, children);
    parents.add(mather);

    ArrayList<Human> parents2 = new ArrayList<>();
    Human fatrher = new Human("Genna", true, 45, children);
    parents2.add(fatrher);

    ArrayList<Human> grenParents = new ArrayList<>();
    Human grendpa = new Human("Vova", true, 70, parents);
    Human grendpa2 = new Human("Dima", true, 72, parents2);
    grenParents.add(grendpa);
    grenParents.add(grendpa2);

    ArrayList<Human> grenParents2 = new ArrayList<>();
    Human grenma = new Human("Ganna", false, 69, parents);
    Human grenma2 = new Human("Maria", false, 70, parents);
    grenParents2.add(grenma);
    grenParents2.add(grenma2);

    for (Human grPar1 : grenParents) {
      System.out.println(grPar1);
    }
    for (Human grPar2 : grenParents2) {
      System.out.println(grPar2);
    }
    for (Human par : parents2) {
      System.out.println(par);
    }
    for (Human par2 : parents) {
      System.out.println(par2);
    }
    for (Human sun : children) {
      System.out.println(sun);
    }
  }

  public static class Human {
    String name;
    boolean sex;
    int age;
    ArrayList<Human> children = new ArrayList<>();

    public Human(String name, boolean sex, int age) {
      this.name = name;
      this.age = age;
      this.sex = sex;
    }

    public Human(String name, boolean sex, int age, ArrayList<Human> children) {
      this.name = name;
      this.age = age;
      this.sex = sex;
      this.children = children;
    }

    public String toString() {
      String text = "";
      text += "Имя: " + this.name;
      text += ", пол: " + (this.sex ? "мужской" : "женский");
      text += ", возраст: " + this.age;

      int childCount = this.children.size();
      if (childCount > 0) {
        text += ", дети: " + this.children.get(0).name;

        for (int i = 1; i < childCount; i++) {
          Human child = this.children.get(i);
          text += ", " + child.name;
        }
      }
      return text;
    }
  }

}

