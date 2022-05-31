import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class QPrimeTest {
    @Test
    public void primenumTest1() {
        boolean result = QPrime.isPrime(-1);
        System.out.println("-1 is a prime number: " + result);
    }

    @Test
    public void primenumTest2() {
        boolean result = QPrime.isPrime(0);
        System.out.println(("0 is a prime number " + result));
    }

    @Test
    public void primenumTest3() {
        boolean result = QPrime.isPrime(2);
        System.out.println("2 is a prime number " + result);

    }

    @Test
    public void primenumTest4() {
        boolean result = QPrime.isPrime(99);
        System.out.println("99 is a prime number " + result);
    }
}