import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int aDonde = scanner.nextInt();
        
        System.out.println("Where from?");
        int deDonde = scanner.nextInt();
        
        for(int i = deDonde; i <= aDonde; i++){
            if(aDonde < deDonde){
                break;
            }
            System.out.println(i);
        }
    }
}
