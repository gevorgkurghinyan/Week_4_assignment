package com.gevkurg;

import java.util.ArrayList;


public class Generate_All_Parentheses_2 {
  public static ArrayList<String> generateParenthesis(int a) {
    if (a <= 0) {
      return null;
    }

    ArrayList<String> result = new ArrayList<String>();
    generateParenthesis(a, 0, 0, "", result);
    return result;
  }

  private static void generateParenthesis(int n, int openCount, int closeCount,
      String current, ArrayList<String> result){
    if (current.length() == 2 * n) {
      result.add(current);
      return;
    }

    if (openCount < n) {
      generateParenthesis(n, openCount + 1, closeCount, current + "(", result);
    }

    if (closeCount < openCount) {
      generateParenthesis(n, openCount, closeCount + 1, current + ")", result);
    }
  }
}
