package com.company.Level_13.HerFarm;

public class MoldovanHen extends Hen {
  @Override
  public int getCountOfEggsPerMonth() {
    return 20;
  }
  @Override
  public String getDescription() {
    return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

  }
}
