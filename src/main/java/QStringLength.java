public class QStringLength {
    public static int stringLength1(String str){
        int count = 0;
        for(char s : str.toCharArray()){
            count++;
        }
        return count;


    }
}
