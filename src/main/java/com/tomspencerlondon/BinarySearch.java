package com.tomspencerlondon;

public class BinarySearch {

  public int findIndexOf(int key, int[] numbers) {
    int midpoint = (numbers.length - 1) / 2;
    if (key == numbers[midpoint]) {
      return midpoint;
    }
    return -1;
  }
}
