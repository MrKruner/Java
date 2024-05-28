package spoj;
import java.util.Scanner;

class EIEVERYN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numTestCase = scn.nextInt();

        for(int i = 0; i < numTestCase; i++){
            int lenNum = scn.nextInt();
            int target = scn.nextInt();
            int[] listNum = new int[lenNum];

            // Flag method
            boolean[] flags = new boolean[target + 1];

            for(int j=0; j<lenNum; j++){
                int num = scn.nextInt();

                if(num>=1 && num<=target){
                    flags[num] = true; 
                }
                listNum[i] = num;
            }

            int k;
            for(k = 1; k <= target; k++){
                if(flags[k] != true){
                    break;
                }
            }

            if(k == target + 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            // String haveEveryNum = "No";

            // if(listNum.contains(1) && listNum.contains(target)){
            //     Collections.sort(listNum);

            //     for(int j=1; j<listNum.size(); j++){
            //         if(listNum.get(j) > listNum.get(j-1) + 1){
            //             break;
            //         }
            //     }
            //     haveEveryNum = "Yes";
            // }

            // System.out.println(haveEveryNum);
        }

         


        // for(int i=0; i<numTestCase; i++){
        //     int lenNum = scn.nextInt();
        //     int lastDigit = scn.nextInt();
        //     List<Integer> listNum = new ArrayList<>();

        //     for(int j=0; j<lenNum; j++){
        //         int num = scn.nextInt();
        //         listNum.add(num);
        //     }

        //     String haveEveryNum = "Yes";

        //     for(int k=1; k<lastDigit; k++){
        //         if(!listNum.contains(k)){
        //             haveEveryNum = "No";
        //         }
        //     }

        //     System.out.println(haveEveryNum);
        // }

        scn.close();

    }
}