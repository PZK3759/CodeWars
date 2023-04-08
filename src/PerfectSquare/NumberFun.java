package PerfectSquare;

import java.lang.Math;
public class NumberFun {
    public static long findNextSquare(long sq){

        double sqrt = Math.sqrt(sq);

        if(sqrt - Math.floor(sqrt) == 0){
            return (long) ((sqrt+1)*(sqrt+1));
        }
        else{
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(114));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(121));

    }
}
