package spoj;
import java.util.Scanner;

class EIUCUBES {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
    
        int brickNum = scr.nextInt();
        int layerNum = 0;

        if(brickNum<1){
            System.out.println(layerNum);
        }

        int birckNumLayer = 0;

        while(brickNum != 0){

            layerNum++;
            birckNumLayer+=layerNum; 
            brickNum -= birckNumLayer;

            if(brickNum < 0){
                layerNum--;
                break;
            }
        }

        System.out.println(layerNum);


        scr.close();
    }
}