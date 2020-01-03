package com.company.Level_13.HerFarm;

public class RussianHen extends Hen {
  @Override
  public int getCountOfEggsPerMonth() {
    return 3;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

  }
}