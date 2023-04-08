package TestTriangle;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {

        if (a > 0 || b > 0 || c > 0){
            if ((a+b)>c && (b+c)>a && (c+a)>b){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(2, 2, 3));
    }
}
