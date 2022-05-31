import org.junit.Test;

import static org.junit.Assert.*;

public class QStringLengthTest {
    @Test
    public void strLengthTest1(){
        String strInput = "Good";
        System.out.println("length of the String " + strInput + " is: " +QStringLength.stringLength1(strInput));

    }
    @Test
    public void strLengthTest2(){
        String strInput = "Test200";
        System.out.println("length of the String " + strInput + " is: " +QStringLength.stringLength1(strInput));

    }
}