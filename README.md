Write an algorithm that finds the number of ways in which you can move N meters by doing jumps of 1, 2, 3, 4, or 5 meter lengths. Assume that N can be a very large number. What is the resulting complexity?

Complexity Analysis

Time Complexity: 
O(N) The algorithm iterates through each number from 1 to N, performing a constant number of operations (up to 5 additions) in each iteration.

Space Complexity: 
O(N) The algorithm uses an array dp of size N+1 to store the number of ways to reach each meter.
