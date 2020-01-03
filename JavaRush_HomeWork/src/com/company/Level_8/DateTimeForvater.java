package com.javarush.task.task08.task0827;

import java.util.Date;
import java.time.format.*;
import java.util.Locale;
import java.time.LocalDate;
/*
Работа с датой
*/

public class Solution {
  public static void main(String[] args) {
    System.out.println(isDateOdd("MAY 1 2013"));
    System.out.println(isDateOdd("MAY 2 2013"));
    System.out.println(isDateOdd("MAY 7 2013"));
    System.out.println(isDateOdd("MAY 10 2013"));
  }

  public static boolean isDateOdd(String date) {

    DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .appendPattern("MMMM d yyyy")
            .toFormatter(Locale.ENGLISH);

    int dayOfYear = LocalDate.parse(date, formatter).getDayOfYear();

    return dayOfYear % 2 == 1;
  }
}
