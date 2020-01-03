package com.company.Level_9;

package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
    String data = reder.readLine();

    SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");

    Date dt = dt = form.parse(data);

    SimpleDateFormat form2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

    System.out.println(form2.format(dt).toUpperCase());
    //напишите тут ваш код
  }
}

