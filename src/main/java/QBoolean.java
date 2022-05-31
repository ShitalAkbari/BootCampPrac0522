public class QBoolean {
    public static boolean Method3(int marks){

        Boolean passed = false;

        if (marks <=34){
            passed = false;
        }else if (marks >35){
            passed = true;
        }return passed;
    }

    public static void main(String[] args) {
        boolean ipassed = Method3(33);
        boolean ipassed1 = Method3(75);
        System.out.println(ipassed);
        System.out.println(ipassed1);
    }
}
