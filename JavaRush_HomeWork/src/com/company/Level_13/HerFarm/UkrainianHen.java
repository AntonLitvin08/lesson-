package com.company.Level_13.HerFarm;

public class UkrainianHen extends Hen {
  @Override
  public int getCountOfEggsPerMonth() {
    return 89;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

  }
}