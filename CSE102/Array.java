import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Random rd = new Random();

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = rd.nextInt(100);
        }

        for(int i=0; i<n; i++){
            
        }

        scn.close();
    }

    public void printEvenNum(int[] arr){

        StringBuilder sbEvenNum = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                sbEvenNum.append(arr[i]+ " ");
            }
        }
    }

    public void printOddIndex(int[] arr) {
        StringBuilder sbEvenNum = new StringBuilder();

        for(int i=1; i<arr.length; i+=2){
            sbEvenNum.append(arr[i]+ " ");
        }
    }

    public void sumArr(int[] arr){
        
        int sum = 0;

        for(int n : arr){
            sum += n;
        }   
    
        System.out.println("Sum of arr: " + sum);
    }
}