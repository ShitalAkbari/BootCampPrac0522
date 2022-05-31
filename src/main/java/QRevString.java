public class QRevString {
    public static void revString1(String str, String rstr){
        for (int j = str.length()-1;j>=0; --j){
            rstr +=str.charAt(j);

        }
        System.out.println("The Original String "  + str);
        System.out.println("The reverse String "  + rstr);

    }

}
