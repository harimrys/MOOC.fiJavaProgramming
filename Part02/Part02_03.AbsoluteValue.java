import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        if(num < 0){
            int numA = num * (-1);
            System.out.println(numA);
        } else {
            System.out.println(num);
        }
    }
}
