import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B {

    static StringBuilder sbPerfectNum = new StringBuilder();
    static StringBuilder sbLocation = new StringBuilder();

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Random rd = new Random();

        StringBuilder sbOddNum = new StringBuilder();

        int n = scn.nextInt();
        int[] arr = new int[n];

        int maxNum = Integer.MIN_VALUE;
        int minPositiveNum = Integer.MAX_VALUE;
        int maxNegativeNum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = rd.nextInt(100);

            if(arr[i] > maxNum){
                maxNum = arr[i];
            }

            if(arr[i] > 0 && minPositiveNum > arr[i]){
                minPositiveNum = arr[i];
            }

            if(arr[i] < 0 && maxNegativeNum < arr[i]){
                maxNegativeNum = arr[i];
            }

            if(i % 2 != 0){
                sbOddNum.append(arr[i] + " ");
            }

            isPerfectNum(arr[i]);
        }

// //////////////////
        System.out.println(Arrays.toString(arr));

        System.out.println(sbOddNum);        
        System.out.println(sbPerfectNum);

        checkXisInclude(arr);

        if(findXlocation(arr)){
            System.out.println(sbLocation);
        }else{
            System.out.println(-1);
        }

        System.out.println(findMaxNum(arr, maxNum));

        // Exercise 6
        System.out.println(minPositiveNum);
        System.out.println(maxNegativeNum);

        // Exercise 7
        System.out.println(findTheSecondLargestNum(arr, maxNum));

    }

    public static void isPerfectNum(int num){
        int sum = 0;

        for(int j=1; j<num/2; j++){
            if(num % j == 0){
                sum += j;
            }
        }

        if(sum == num){
            sbPerfectNum.append(num + " ");
        }
    }

    public static void checkXisInclude(int[] nums){
        
        Scanner scn = new Scanner(System.in);

        int numX = scn.nextInt();

        boolean isInclude = false;

        for(int n : nums){
            if(n == numX){
                isInclude = true;
                break;
            }
        }

        System.out.println((isInclude) ? numX + " is included" : numX + " is excluded");
    }

    public static boolean findXlocation(int [] nums){
        
        Scanner scn = new Scanner(System.in);

        int numX = scn.nextInt();

        boolean isInclude = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == numX){
                sbLocation.append(i + " ");
                isInclude = true;
            }
        }
        
        return isInclude;
    }

    public static int findMaxNum(int [] nums, int maxNum){
        
        int i = 0;

        for(i=0; i<nums.length; i++){
            if(maxNum == nums[i]){
                break;
            }
        }

        return i;
    }

    public static int findTheSecondLargestNum (int[] nums, int maxNum){
        
        int secondMaxNum = 0;
        
        for(int n : nums){
            if(n > secondMaxNum && n < maxNum){
                secondMaxNum = n;
            }
        }

        return secondMaxNum;
    }
}
