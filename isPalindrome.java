/*
 Problem: 
 Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:
-231 <= x <= 231 - 1
 */


public class isPalindrome {
    /*
     * Solution to the above problem. 
     * @param x - the integer that is being evaluated 
     * @return - whether it is a palindrome or not 
     */
    public boolean isIntPalindrome(int x) {
        boolean result = false; 
        int reversed = 0; 
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        } 

        if (x == reversed)
        {
            result = true; 
        }
        return result; 
    } 
}
