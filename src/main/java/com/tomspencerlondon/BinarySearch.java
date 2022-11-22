package com.tomspencerlondon;

public class BinarySearch {

  public int findIndexOf(int key, int[] numbers) {
    return binarySearch(key, numbers, 0, numbers.length - 1);
  }

  private static int binarySearch(int key, int[] numbers, int low, int high) {
    return binaryHelper(key, numbers, low, high);
  }

  private static int binaryHelper(int key, int[] numbers, int low, int high) {
    if (low <= high && low <= numbers.length) {
      int midpoint = (low + high) / 2;
      if (key == numbers[midpoint]) {
        return midpoint;
      }

      if (key < numbers[midpoint]) {
        return binaryHelper(key, numbers, low, midpoint - 1);
      }

      return binaryHelper(key, numbers, midpoint + 1, high);
    }

    return -1;
  }
}
