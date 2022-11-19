package com.tomspencerlondon;

public class BinarySearch {

  public int findIndexOf(int key, int[] numbers) {
    int low = 0;
    int high = numbers.length - 1;
    while (low <= high) {
      int midpoint = (low + high) / 2;
      if (key == numbers[midpoint]) {
        return midpoint;
      }

      if (key > numbers[midpoint]) {
        low = midpoint + 1;
      }

      if (key < numbers[midpoint]) {
        high = midpoint - 1;
      }
    }
    return -1;
  }
}
