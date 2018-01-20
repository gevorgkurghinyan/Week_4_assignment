package com.gevkurg;

import java.util.ArrayList;
import java.util.Arrays;


public class Letter_Phone {
  public static ArrayList<String> letterCombinations(String s) {
    if(s == null || s.length() == 0) {
      return null;
    }

    ArrayList<String> map = new ArrayList<String>(
        Arrays.asList("0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));
    ArrayList<String> result = new ArrayList<String>();
    result.add("");
    return letterCombinations(s, 0, map, result);
  }

  private static ArrayList<String> letterCombinations(String s, int i, ArrayList<String> map, ArrayList<String> result){
    if (i == s.length()) {
      return result;
    }

    int index = s.charAt(i) - '0';
    String str = map.get(index);
    ArrayList<String> array = new ArrayList<String>();
    for(String st : result) {
      for (char c : str.toCharArray()){
        array.add(st + c);
      }
    }

    result = array;
    return letterCombinations(s, i + 1, map, result);
  }
}
