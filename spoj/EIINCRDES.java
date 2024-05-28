package spoj;
import java.util.Scanner;

class EIINCRDES {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);

        int lenArray = scn.nextInt();

        int[] numArray = new int[lenArray];

        for(int i=0; i<numArray.length; i++){
            int element = scn.nextInt();
            numArray[i] = element;
        }

        int pointer = 1;
        String prevState="";
        String state = "";

        while (pointer<lenArray) {
            if(numArray[pointer-1]< numArray[pointer]){
                state = "increasing";
            }else if(numArray[pointer-1]> numArray[pointer]){
                state = "decreasing";
            }else{
                state = "none";
                break;
            }
            if(prevState==""){
                prevState = state;
            }else{
                if(state.compareTo(prevState)!=0){
                    state = "none";
                    break;
                }
            }
            pointer++;
        }

        System.out.println(state);

        scn.close();
    }    
}
