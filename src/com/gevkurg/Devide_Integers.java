package com.gevkurg;

public class Devide_Integers {

  public static int divide(int a, int b) {
    if (b == 0 || a == Integer.MIN_VALUE && b == -1){
      return Integer.MAX_VALUE;
    }

    if (b == 0) {
      return 0;
    }

    boolean sign = a > 0 && b > 0 || a < 0 && b < 0 ? true : false;

    long x = Math.abs((long)a);
    long y = Math.abs((long)b);

    if (b == 1) {
      return sign ? a : -a;
    }

    int result = 0;

    while (x >= y) {
      long temp = y;
      long count = 1;

      while (a >= temp << 1) {
        temp <<= 1;
        count <<= 1;
      }

      x -= temp;
      result += count;
    }

    return sign ? result : -result;
  }
}
