# BinarySearch
Binary Search TDD Java

### Mission

Find the index of a given number in an array of numbers if it is present.

### Algorithm
#### Iterative version
1. Create low and high indices at beginning and end of the indices of the number array
2. While low is less than or equal to high keep looking
- Set the midpoint to the (low + high) divided by two
- If the key is equal to the midpoint index number then return midpoint
- If the key is larger than the midpoint index number then set low to midpoint plus one
- If the key is less than the midpoint index number then set high to midpoint index minus one
   
#### Recursive version
1. Create binarySearch method that takes target and numbers
2. Create binaryHelper method that takes target, numbers, low, high
- Add guard in binaryHelper to return only carry on searching if low is less than or equal to high and low is less than numbers length
- create midpoint as low plus high divided by two
- if numbers midpoint is same as target return midpoint
- if numbers midpoint is less than target add one to low and call binaryHelper with target, numbers, low + 1, high
- if numbers midpoint is more than target remove one from high and call binaryHelper with target, numbers, low, high - 1
3. return -1 if number is not found
