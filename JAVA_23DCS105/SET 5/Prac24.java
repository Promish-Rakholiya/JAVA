//import java.util.InputMismatchException;

import java.util.*;

public class Prac24 {

    public static void main(String[] args) {
        int x, y;
        float ans;
        try {
            System.out.println("Enter the value of X : ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            System.out.println("Enter the value of Y : ");
            y = sc.nextInt();
            ans = x / y;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println("The Value of Y can't be ZERO!!!!");
        } catch (InputMismatchException e2) {
            System.out.println(e2);
        } catch (Exception e3) {
            System.out.println(e3);
        }

    }
}                   
//Scanner sc = new Scanner(System.in);
//x = sc.nextInt();