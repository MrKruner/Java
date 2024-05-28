 

import java.util.ArrayList;
import java.util.List;

public class N_thTribonacciNumberSolution {
    public int tribonacci(int n) {
        List<Integer> listT = new ArrayList<>();

        listT.add(0);
        listT.add(1);
        listT.add(1);

        int result = 0;

        if(n==1 || n==2){
            return 1;
        }
    
        for(int i=0; i< n-2; i++){
            result = listT.get(i) + listT.get(i+1) + listT.get(i+2);
            listT.add(result);
        }

        return result;
    }

    public static void main(String[] args) {
        N_thTribonacciNumberSolution solution = new N_thTribonacciNumberSolution();

        System.out.println(solution.tribonacci(2));
    }
}
