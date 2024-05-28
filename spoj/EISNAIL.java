package spoj;

import java.util.Scanner;

class EISNAIL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

        double A = scn.nextInt();
        double B = scn.nextInt();
        double V = scn.nextInt();

    	double day = Math.ceil((V-A)/(A-B));

        System.out.println((int)day+1);
		
		scn.close();
	}
}