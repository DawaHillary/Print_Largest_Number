import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//A program that takes 2 numbers and print the largest number.

        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int num2 = number2.nextInt();

        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        }
        else {
            System.out.println("The largest number is: " + num2);
        }



    }
}