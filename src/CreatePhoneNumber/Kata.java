package CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers){

        String no = "(";

        for(int i=0; i<numbers.length; ++i) {
            if(i<2) {
                no += "" + numbers[i];
            }else if(i==2) {
                no += "" +numbers[i] + ") ";
            }else if(i>2 && i<5) {
                no += ""+numbers[i];
            }else if(i == 5){
                no += ""+numbers[i]+"-";
            }else {
                no += ""+numbers[i];
            }

        }

        return no;

    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1,7,0,0,9,7,3,6,0,9}));
    }
}
