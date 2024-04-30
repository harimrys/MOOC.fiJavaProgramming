import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        int squared = numero * numero;
        
        System.out.println(squared);
    }
}
