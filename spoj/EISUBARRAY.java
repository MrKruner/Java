package spoj;
import java.util.*;

class EISUBARRAY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int num = scn.nextInt(); 

            if(sum<0){
                sum = 0;
            }

            sum += num;

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);

        scn.close();
	}
}