import java.util.Arrays;

public class QSecondLargeNum {
    public static void secondlargestArray(){
        int [] arr = {1, 5, 1055, 50, 95, 60, 8};
        int largest = arr[0]; //1
        int secondlargest = arr[1];

        for(int i = 0; i<arr.length; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
            else if (arr[i]>secondlargest && arr[i]!=largest){
    secondlargest=arr[i];
            }
        }
        System.out.println("Without sorting second largest is :" + secondlargest );
    }
}
