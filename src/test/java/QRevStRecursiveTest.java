import org.junit.Test;

import static org.junit.Assert.*;

public class QRevStRecursiveTest {
    @Test
    public void REvSTRECursiveTest1() {
        String str = "Good";
        char[] ch = str.toCharArray();
        int length = ch.length;
        QRevStRecursive.PrintRevSTRec(ch, length);

    }

    @Test
    public void REvStRecursiveTest1() {

        String str = "Test";
        char[] ch = str.toCharArray();
        int length = ch.length;
        QRevStRecursive.PrintRevSTRec(ch, length);

    }
}