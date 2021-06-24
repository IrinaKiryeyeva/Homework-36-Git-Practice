/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n = (int)(Math.random() * 1000);
        System.out.println(n + (n % 2 == 0 ? " is EVEN" : " is ODD"));
	}
}