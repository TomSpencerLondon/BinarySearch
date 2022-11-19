package com.tomspencerlondon;

public class BinarySearch {

  public int findIndexOf(int key, int[] numbers) {
    int low = 0;
    while (low <= numbers.length - 1) {
      int midpoint = (low + numbers.length - 1) / 2;
      if (key == numbers[midpoint]) {
        return midpoint;
      }

      if (key > numbers[midpoint]) {
        low = midpoint + 1;
      }
    }
    return -1;
  }
}
