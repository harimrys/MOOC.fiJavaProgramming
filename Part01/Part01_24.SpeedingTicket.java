import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int num = scanner.nextInt();
        
        if(num > 120){
            System.out.println("Speeding ticket!");
        }
    }
}
