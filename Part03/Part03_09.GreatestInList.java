import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        
        int mayor = list.get(0); //suponemos que el mayor esta en la posicion 0
        
        for(int i = 0; i < list.size(); i++){
            int num = list.get(i); //cada numero de la lista
            
            if(mayor < num){
                mayor = num;
            }  
        }
        System.out.println("The greatest number: " + mayor);       
    }
}
