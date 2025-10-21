import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    static int firstNumber;
    static int secondNumber;
    public static void main(String[] args) {
        boolean valid = false;
        do {
            try {
                enter();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("You should enter a only Integers, try again");
                input.next();
            }
            catch (CustomException s) {
                System.out.println(s);
            }
        } while (!valid);

        division();
    }


    public static void enter() throws CustomException {
        System.out.println("enter the first number");
         firstNumber = input.nextInt();
        System.out.println("enter the second number");
         secondNumber = input.nextInt();

         if(secondNumber==7){
             throw new CustomException("the second number cant be 7");
         }

    }
    public static void division() {
        boolean valid = false;
        do {
            try {
                System.out.println(firstNumber + "/" + secondNumber + "=" + firstNumber / secondNumber);
                valid = true;
            } catch (ArithmeticException e) {
                System.out.println("Division by zero, please enter the second number again");
                secondNumber = input.nextInt();
            }
        }while (!valid);
    }
}