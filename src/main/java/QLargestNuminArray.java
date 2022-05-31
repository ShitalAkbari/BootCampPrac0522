import java.util.Scanner;

public class QLargestNuminArray {
    public static void largestnumArray(){
        int[] arr = {1, 5, 1055, 50, 95, 60, 8};
        int maxNumber = arr[0]; //1
        for(int i = 0; i<arr.length; i++){
            if (arr[i]>maxNumber){
                maxNumber = arr[i];
            }
        }
        System.out.println("the Largest Number is " + maxNumber);
    }
}
