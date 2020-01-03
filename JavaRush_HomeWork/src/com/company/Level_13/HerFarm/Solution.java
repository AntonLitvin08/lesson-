package com.company.Level_13.HerFarm;

/* 
Куриная фабрика
*/

public class Solution {
  public static void main(String[] args) {
    Hen hen = HenFactory.getHen(Country.RUSSIA);

    hen.getCountOfEggsPerMonth();
    System.out.println(hen);
  }

  static class HenFactory {

    static Hen getHen(String country) {

      Hen hen = null;

      if (country.equals(Country.BELARUS)) {
        hen = new BelarusianHen();
      }
      if (country.equals(Country.UKRAINE)) {
        hen = new UkrainianHen();
      }
      if (country.equals(Country.RUSSIA)) {
        hen = new RussianHen();
      }
      if (country.equals(Country.MOLDOVA)) {
        hen = new MoldovanHen();
      }
      return hen;
    }
  }
}


