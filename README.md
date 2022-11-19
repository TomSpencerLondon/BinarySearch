# BinarySearch
Binary Search TDD Java

### Mission

Find the index of a given number in an array of numbers if it is present.

### Algorithm
1. Create low and high indices at beginning and end of the indices of the number array
2. While low is less than or equal to high keep looking
   A. Set the midpoint to the (low + high) divided by two
   B. If the key is equal to the midpoint index number then return midpoint
   C. If the key is larger than the midpoint index number then set low to midpoint plus one
   D. If the key is less than the midpoint index number then set high to midpoint index minus one
   
