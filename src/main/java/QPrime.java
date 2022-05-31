public class QPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;

        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                return false;
            }
        }
        return true;
    }
}



