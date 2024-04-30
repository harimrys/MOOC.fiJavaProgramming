import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        
        while(true){
            int number = scanner.nextInt();
            
            if(number == 0){
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if(number < 0){
                continue;   
            } else {
                contador++;
                suma += number;    
            }
        }
        double media = (double) suma / contador;
        System.out.println(media);

    }
}
