import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            
            if(number == 0){
                break;
            }
            
            if(number < 0){
                System.out.println("Unsuitable number");
               // continue;
            }
            
            if(number > 0){
                int elevado = number * number;
                System.out.println(elevado);
            }
        }

    }
}
