import java.util.Scanner;

public class YogurtSale {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numTest = scn.nextInt();

        for(int i=0; i<numTest; i++){
            int n = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();

            int price = 0;

            if(n % 2 == 0){
                price = Math.min(b * (n/2), a * n);
            }else{
                price = Math.min(b * (n/2) + a, a * n);
            }

            System.out.println(price);
        }

        scn.close();
    }
}
