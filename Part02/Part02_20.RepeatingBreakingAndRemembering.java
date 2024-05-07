import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int suma = 0;
        int contador = 0;
        double media = 0;
        int contPares = 0;
        int contImpares = 0;
        
        while(true){
            int num = scanner.nextInt();
            
            if(num == -1){
                break;
            }
            
            if(num % 2 == 0){
                contPares++;
            } else {
                contImpares++;
            }
            
            suma += num;
            contador++;
            media = (double) suma / contador;
            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + suma);
        System.out.println("Numbers: " + contador);
        System.out.println("Average: " + media);
        System.out.println("Even: " + contPares);
        System.out.println("Odd: " + contImpares);
    }
}
