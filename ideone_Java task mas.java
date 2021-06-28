/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] a = new int[5][8];
        int max = -99;
        for (int i = 0; i < a.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < a[i].length; j++) {
                int val = new Random().nextInt(198) - 99;
                a[i][j] = val;
                max = Math.max(val, max);
                row.append(val).append(" ");
            }
            System.out.println(row);
        }
        System.out.println(max);
	}
}