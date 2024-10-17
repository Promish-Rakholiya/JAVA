import java.util.Scanner;

class UserDefinedException extends Exception {

    public UserDefinedException(String message) {
        super(message);
    }
}

public class Prac26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new UserDefinedException("Number cannot be negative");
            }
            System.out.println("You entered: " + number);
        } catch (UserDefinedException e) {
            System.out.println("Caught UserDefinedException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            int[] array = {1, 2, 3};
            System.out.println(array[4]);
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
