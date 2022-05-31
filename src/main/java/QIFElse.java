public class QIFElse {

    public static void IfElse1(String car) {

        if (car == "BMW") {
            System.out.println("My name is BMW");
        } else {
            System.out.println("I am different");
        }
    }

    public static void IfElse2(int age) {

        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("under age");

        }
    }

    public static void main(String[] args) {
        IfElse1("Honda");
        IfElse2(5);

    }
}



