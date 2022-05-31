import java.lang.reflect.Array;
import java.util.Arrays;

public class QBubbleSort {
    public static void bubblueSort(){
        int a[]= {400, 60, 580, 9, 1122};
        System.out.println("Array before sorting " + Arrays.toString(a));
        int n = a.length;
        for(int i=0; i<n-1; i++) //Number of passes
        {
            for (int j=0; j<n-i-1; j++)//Iterations in each pass
            {
                if (a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }


        System.out.println("Array after sorting " + Arrays.toString(a));

    }
}
