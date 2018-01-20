package com.gevkurg;

import java.util.ArrayList;


public class Different_Bits_Sum_Pairwise {

  public int cntBits(ArrayList<Integer> a) {
    int sum = 0;

    for(int i = 0; i < 32; ++i) {
      int count = 0;
      for(int j = 0; j < a.size(); ++j) {
        if (((a.get(j) >> i) & 1) == 1){
          ++count;
        }
      }

      sum += (count % 1000000007) * ((a.size() - count) % 1000000007);
    }

    return 2 * sum;
  }
}
