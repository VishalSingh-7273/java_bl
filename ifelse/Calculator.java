import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("which operation you want to do");
        char op = sc.next().charAt(0);

        switch(op) {
            case '+': System.out.println("result = " + a + b); break;
            case '-': System.out.println("result = " + (a - b)); break;
            case '*': System.out.println("result = " + a * b); break;
            case '/': System.out.println("result = " + a / b); break;
            default: System.out.println("Invalid Operator");
        }
    }
}