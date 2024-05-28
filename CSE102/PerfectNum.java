import java.util.Random;

public class PerfectNum {
    public static void main(String[] args) {

        Random rd = new Random();


        for(int j=0; j<= 1000; j++){

            int n = rd.nextInt();

            int sum = 0;

            for(int i=1; i<=n/2; i++){
                if(n % i == 0){
                    sum += i;
                }
            }

            if(sum == n){
                System.out.printf("%d\t YES", n);
            }
        }
    }
}
