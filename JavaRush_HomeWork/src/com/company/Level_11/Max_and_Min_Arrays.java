package com.company.Level_11;

public class Max_and_Min_Arrays {
    public static void main(String[] args) {
      int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

      Pair<Integer, Integer> result = getMinimumAndMaximum(data);

      System.out.println("The minimum is " + result.x);
      System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
      if (inputArray == null || inputArray.length == 0) {
        return new Pair<Integer, Integer>(null, null);
      }

      int max = inputArray[0];
      int min = inputArray[0];

      for (int i = 0; i < inputArray.length; i++) {
        if (max > inputArray[i]) {
          max = inputArray[i];
        } else if (min < inputArray[i]){
          min = inputArray[i]; }

      }
      return new Pair<Integer, Integer>(max,min);
    }

    public static class Pair<X, Y> {
      public X x;
      public Y y;

      public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
      }
    }
  }

}
