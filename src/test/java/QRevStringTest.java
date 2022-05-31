import org.junit.Test;

import static org.junit.Assert.*;

public class QRevStringTest {

    @Test
    public void revStringTest1() {
        QRevString.revString1("Test",  "");
    }

    @Test
    public void revStringTest2() {
        QRevString.revString1("Good",  "");
    }

    @Test
    public void revStringTest3() {
        QRevString.revString1("Hello",  "");
    }
}