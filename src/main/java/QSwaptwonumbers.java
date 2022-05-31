import java.util.Scanner;

public class QSwaptwonumbers {

        //Swap two variables without using a third variable
    public static void swaptwovariables() {
        int a = 100;
        int b = 200;

        System.out.println("Before Swapping " + a + " " + b);//100 200
        a = a + b;//a=100+200=300
        b = a - b;//b=300-200=100
        a = a - b;//a=300-100=200
        System.out.println("After Swapping " + a + " " + b);//200 100);

    }


//    public static void swap(int[] numbers) {
//        int a = numbers[0];
//        int b = numbers[1];
//        a = a + b;// now a is 30 and b is 20
//        b = a - b; // now a is 30 but b is 10 (original value of a)
//        a = a - b; // now a is 20 and b is 10, numbers are swapped
//        numbers[0] = a;
//        numbers[1] = b;
    }


