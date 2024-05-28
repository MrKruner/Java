import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numTest = scn.nextInt();

        for(int i=0; i<numTest; i++){

            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
        
            if(a == b + c || b == a + c || c == a + b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        scn.close();
    }
}
