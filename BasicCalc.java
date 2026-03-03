import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1, number2;
        double add, sub, mul, div;

        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();

        add = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);

        sc.close();
    }
}