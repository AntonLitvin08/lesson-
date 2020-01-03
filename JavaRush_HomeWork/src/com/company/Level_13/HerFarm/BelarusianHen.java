package com.company.Level_13.HerFarm;

public class BelarusianHen extends Hen {
  @Override
  public int getCountOfEggsPerMonth() {
    return 48;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

  }
}
