import java.util.Scanner;

public class TachHam {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] arr = generateArray();

        System.out.println(arr);
    }

    public static int[] generateArray(){

        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();            
        }


        return a;
    }
}
