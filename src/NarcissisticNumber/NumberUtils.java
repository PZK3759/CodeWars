package NarcissisticNumber;

import java.lang.Math;
public class NumberUtils {

    public static boolean isNarcissistic(int number){

        int power=0, temp=number,sum=0,n=number;
        
        while (temp != 0) {

            temp /= 10;
            power += 1;
        }

        while (n>0){
            sum += Math.pow(n%10, power) ;
            n /= 10;
        }

        return (sum==number);
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

}
