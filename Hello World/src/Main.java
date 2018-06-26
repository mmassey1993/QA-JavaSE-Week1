import java.util.*;
import java.math.*;
public class Main {


    public static void main(String[] args) {
       //task 1
        System.out.println("Hello World!");

        //task 2
        String HW = "Hello World!";
        System.out.println(HW);

        //task 3
        ReturnMethod("I did it");

        //task 4
        System.out.println(ReturnString());

        //task 8 - iteration
        for (int i = 0; i<10; i++){
            System.out.println(SumTwoNumbers(10, 9, true));
        }

        //task 9 - arrays
        int[] array1 = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(SumTwoNumbers(array1[5], array1[3], false));

        //task 10 - iteration/arrays
        for (int i = 0; i<10;i++){
            System.out.println(array1[i]);
        }

        //task 11 - iterations/arrays 2
        for (int i =0; i<10;i++){
            System.out.println(array1[i]*10);
        }

        //task 12
        System.out.println(BlackJack(22,19));
        //task 13
        System.out.println(UniqueSum(14,3,3));
        //task 14
        System.out.println(TooHot(60, false));
    }

    //task 3
    public static void ReturnMethod(String a){
        System.out.println(a);
    }

    //task 4
    public static String ReturnString(){
        return "Hello World!";
    }

    //tasks 5,6 and 7
    public static int SumTwoNumbers(int a, int b, boolean bool){
        if (a == 0) {
            return b;
        }else if (b==0) {
            return a;
        }else if (bool == true){
            return a + b;
        } else {
            return a * b;
        }
    }
    // task 12 - blackjack
    private static int BlackJack(int a, int b){
        if (a<=21 & b<=21){
            return Math.max(a,b);
        } else if (a<=21 & b>=21) {
            return a;
        } else if (a>=21 & b<=21) {
            return b;
        } else {
            return 0;
        }
    }
    //task 13 - unique sum
    private static int UniqueSum(int a, int b, int c){
        if (a == b){
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        } else
            return a + b + c;
    }
    //task 14 - Too Hot?
    private static boolean TooHot(int temp, boolean isSummer){
        if (isSummer) {
            if (temp>=60 & temp <=100){
                return true;
            } else
                return false;
        } else {
            if (temp>=60 & temp <=90) {
                return true;
            } else
                return false;
        }
    }
}

