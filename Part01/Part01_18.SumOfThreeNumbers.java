import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num = Integer.valueOf(scanner.nextLine());
                
        System.out.println("Give the second number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int suma = num + num1 + num2;
        
        System.out.println("The sum of the numbers is " + suma);
    }
}
