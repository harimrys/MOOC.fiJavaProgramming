import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            
            if(number == 0){
                break;
            }
            
            contador++;
            suma += number;
        }
        System.out.println("Number of numbers: " + contador);
        System.out.println("Sum of the numbers: " + suma);
    }
}
