public class QRevStRecursive {

    public static void PrintRevSTRec(char[] ch, int lenght) {
        if (lenght > 0) {
            System.out.println((ch[lenght - 1]));
            lenght--;
            PrintRevSTRec(ch, lenght);
        }
    }
}
