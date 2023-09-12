import java.util.Scanner;

public class AlgoTask1 {
    public static void main(String[] args) {
        System.out.println("This program is count the addition of three digits");
        Scanner console = new Scanner(System.in);
        System.out.println("Input first digit: ");
        int firstNum = console.nextInt();
        System.out.println("Input second digit: ");
        int secondNum = console.nextInt();
        System.out.println("Input third digit: ");
        int thirdNum = console.nextInt();
        int result = firstNum + secondNum + thirdNum;
        System.out.println(firstNum + " + " + secondNum + " + " + thirdNum + " = " + result);
    }
}
