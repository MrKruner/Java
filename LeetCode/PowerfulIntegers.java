 

import java.util.ArrayList;
import java.util.List;

public class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {

        List<Integer> res = new ArrayList<>();
        int target = 2;

        while (target <= bound) {
            for(int powX=0; (int) Math.pow(x, powX)<target; powX++){

                boolean isAdded = false;

                for(int powY=0; (int) Math.pow(y, powY)<target; powY++){
                    if((int) Math.pow(x, powX) + (int) Math.pow(y, powY) == target){
                        res.add(target);
                        isAdded = true;
                        break;
                    }
                }

                if(isAdded){
                    break;
                }
            }
            target++;
        }

        return res;
    }

    public static void main(String[] args) {
        PowerfulIntegers solution = new PowerfulIntegers();
        System.out.println(solution.powerfulIntegers(2, 3, 10));
    }
}
