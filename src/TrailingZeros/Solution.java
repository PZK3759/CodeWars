package TrailingZeros;

public class Solution {

    public static long fact(int x) {
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        return fact;
    }
    public static int zeros(int n){

        long factorial_n = fact(n);
        int zero=0;

        while (true){
            if(factorial_n%10==0){
                zero++;
            }
            if(factorial_n%10 != 0){
                break;
            }
            factorial_n/=10;
        }

        return zero;
    }

    public static void main(String[] args) {

        System.out.println(fact(6));
        System.out.println(zeros(6));
        System.out.println(fact(12));
        System.out.println(zeros(12));
        System.out.println(fact(10));
        System.out.println(zeros(10));
        System.out.println(fact(0));
        System.out.println(zeros(0));
        System.out.println(fact(14));
        System.out.println(zeros(14));
    }
}
