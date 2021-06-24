/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double m = Math.random() * 21;
        double n = Math.random() * 21;
        System.out.println("m = " + m + "; n = " + n);
        System.out.println(Math.abs(10 - m) > Math.abs(10 - n) ? n : m);
	}
}