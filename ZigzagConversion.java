/*
 Problem: 
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:
Input: s = "A", numRows = 1
Output: "A"
 
Constraints:
1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */

 //Solution: 
public class ZigzagConversion {
    
    /*
     * The solution to the above problem
     * @param s - the string to be coverted 
     * @param numRows - the number of rows that are to be zigzaged 
     * @return - the resulting zigzagged string. 
     */
    public String convert(String s, int numRows) {
        if (numRows == 1)
        {
            return s; 
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) 
        {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) 
        {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) 
            {
                goingDown = !goingDown;
            }
            if (goingDown) 
            {
                currentRow++;
            } else 
            {
                currentRow--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString(); 
    }
}
