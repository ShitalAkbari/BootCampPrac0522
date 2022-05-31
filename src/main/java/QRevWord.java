public class QRevWord {
    public static void revWord1(String str){

        String str1 = "";
        String[] a = str.split(" ");
        System.out.println(str);
        for (int i = a.length -1; i>=0; i--){
            str1 += a[i] + " ";
        }
        System.out.println(str1);
    }
}
