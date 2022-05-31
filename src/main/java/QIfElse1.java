public class QIfElse1 {

    public static void Method1(String car) {
//        car = "toyota";
//        car = "BMW";
//        car = "Honda";
        if (car.equals("toyota")) {
            System.out.println("Toyota");
        } else if (car.equals("BMW")) {
            System.out.println("BMW");
        } else if (car.equals("Honda")) {
            System.out.println("Honda");
        } else {
            System.out.println("not Applicable");

        }
    }

    public static void main(String[] args) {
        Method1("Audi");
    }
}



