package spoj;
import java.util.Scanner;

class EIUBIRTH {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int T = scn.nextInt();

        for(int i=0; i<T; i++){

            long B = scn.nextInt();
            long R = scn.nextInt();
            
            long X = scn.nextInt();
            long Y = scn.nextInt();
            long Z = scn.nextInt();

            long bluePrice = 0;
            long redPrice = 0;

            bluePrice = B * X;
            redPrice = R * Y;

            if(X + Z < Y){
                redPrice = R * (X + Z);
            }else if(Y + Z < X){
                bluePrice = B * (Y + Z);
            }
            
            System.out.println(bluePrice + redPrice);
        }

        scn.close();
    }
}
