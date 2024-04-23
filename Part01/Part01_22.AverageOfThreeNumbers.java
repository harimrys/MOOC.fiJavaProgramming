import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num = Integer.valueOf(scanner.nextLine());  
        
        System.out.println("Give the second number:");
        int num1 = Integer.valueOf(scanner.nextLine()); 
        
        System.out.println("Give the third number:");
        int num2 = Integer.valueOf(scanner.nextLine()); 
        
        double media = (num + num1 + num2) / 3.0;
        System.out.println("The average is " + media);     
    }
}
