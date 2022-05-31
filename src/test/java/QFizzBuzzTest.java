import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QFizzBuzzTest {
    QFizzBuzz fbTest = new QFizzBuzz();
    @Test
    public void FizzTest(){
        String fizz = fbTest.fizzbuzz(3);
        Assert.assertEquals(fizz, "Fizz");
    }
    @Test
    public void BuzzTest(){
        String buzz = fbTest.fizzbuzz(5);
        assertEquals(buzz, "Buzz");
    }
    @Test
    public void FizzBuzzTest(){
        String fizzBuzz = fbTest.fizzbuzz(15);
      Assert.assertEquals(fizzBuzz, "Fizz_Buzz");
    }
    @Test
    public void notFizzBuzzTest(){
        String nofizzbuzz = fbTest.fizzbuzz(20);
        Assert.assertNotEquals(nofizzbuzz,20);
    }
}
