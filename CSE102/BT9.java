
import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int distance = scn.nextInt();
        int payment = 0;

        int[] price = {13000, 12000, 11000};
        int[] markedDistance = {0, 1, 30};

        for(int i=price.length-1; i>=0; i--){
            if(distance > markedDistance[i]){
                payment += (int)(distance - markedDistance[i])*price[i];
                distance = markedDistance[i];
            }
        }

        // if(distance < 1){
        //     payment = distance * 13000;
        // }else if(1 < distance && distance <= 29){
        //     payment = (distance - 1) * 12000 + 13000;
        // }else{
        //     payment = (distance - 29) * 11000 + (28 * 12000) + 13000;
        // }

        System.out.println(payment);

        scn.close();
    }
}
