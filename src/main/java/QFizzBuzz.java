public class QFizzBuzz {
    public String fizzbuzz(int n) {

        if (n % 15 == 0) {
            return ("Fizz_Buzz");
        } else if (n % 3 == 0) {
            return ("Fizz");
        } else if (n % 5 == 0) {
            return ("Buzz");
        }
        return (Integer.toString(n));
    }
}


