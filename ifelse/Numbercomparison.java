import java.util.Scanner;
public class Numbercomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b)
            System.out.println("A is larger");
        else
            System.out.println("B is larger");
    }
}

