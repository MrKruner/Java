import java.util.Arrays;
import java.util.Random;

class AtruB {
    public static void main(String[] args) {
        
        Random rd = new Random();

        int[] A = new int[5];
        int[] B = new int[5];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<5; i++){
            // Random both positive and negative nums
            A[i] = rd.nextInt(20) - 10;

            while(findI(A[i], A, i)){
                A[i] = rd.nextInt(20) - 10;
            }

            B[i] = rd.nextInt(10);

            while(findI(B[i], B, i)){
                B[i] = rd.nextInt(10);
            }
        }

        for(int n : A){
    
            boolean isDifference = true;

            for(int n2 : B){
    
                if(n == n2){
                    isDifference = false;
                    break;
                }
    
            }

            if(isDifference){
                sb.append(n + " ");
            }
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(sb);
    }

    public static boolean findI(int x, int[] arr, int index){
        for(int i = 0; i<index; i++){
            if(x == arr[i]){
                return true;
            }
        }

        return false;
    }
}
