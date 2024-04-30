import java.util.Scanner;

public class AverageOfNumbers {

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
        double media = (double) suma / contador;
        System.out.println("Average of the numbers: " + media);

    }
}
