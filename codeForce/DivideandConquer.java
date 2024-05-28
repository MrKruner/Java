import java.util.Scanner;

public class DivideandConquer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numTest = scn.nextInt();

        for(int i=0; i<numTest; i++){
            int len = scn.nextInt();
            int[] array = new int[len];

            long sum = 0;

           for(int j=0; j<len; j++){
                array[j] = scn.nextInt();
                sum += array[j];
            }

            int numOperation = Integer.MAX_VALUE;

            if(sum % 2 == 0){
                System.out.println(0);
            }else{
                for(int k=0 ; k<array.length; k++){
                    numOperation = Math.min(numOperation, (int)(Math.log(array[k])/Math.log(2)) + (array[k] % 2 != 0 ? 1 : 0));
                }
                System.out.println(numOperation);
            }
        }
    }
}
