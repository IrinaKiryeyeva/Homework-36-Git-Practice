/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x = 1 + (int)(Math.random() * (9));
        int y = (int)(Math.random() * (9));
        int z = (int)(Math.random() * (9));
        System.out.println(x * 100 + y * 10 + z);
        System.out.println(Math.max(Math.max(x, y), z));
	}
}