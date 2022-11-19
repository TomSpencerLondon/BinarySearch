package com.tomspencerlondon;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  @Test
  void whenSearchForKeyNotInArryIsMinusOne() {
    BinarySearch binarySearch = new BinarySearch();

    int index = binarySearch.findIndexOf(1, new int[]{0});

    assertThat(index)
        .isEqualTo(-1);
  }

  @Test
  void searchingForKeyPresentInArrayLengthOneIsOne() {
    BinarySearch binarySearch = new BinarySearch();

    int index = binarySearch.findIndexOf(1, new int[]{1});

    assertThat(index)
        .isZero();
  }

  @Test
  void searchingForKeyThatIsMidpointOfArrayLengthThreeIsOne() {
    BinarySearch binarySearch = new BinarySearch();

    int index = binarySearch.findIndexOf(2, new int[]{1, 2, 3});

    assertThat(index)
        .isOne();
  }

  @Test
  void searchingForKeyThatIsMidpointOfUpperHalfOfArrayLengthThreeIsTwo() {
    BinarySearch binarySearch = new BinarySearch();

    int index = binarySearch.findIndexOf(3, new int[]{1, 2, 3});

    assertThat(index)
        .isEqualTo(2);
  }
}
