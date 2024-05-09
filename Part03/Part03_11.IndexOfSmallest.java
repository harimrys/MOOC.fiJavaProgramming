import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList <Integer> list = new ArrayList<>();
        
        while(true){
            int numeros = scanner.nextInt();
            if(numeros == 9999){
                break;
            }
            list.add(numeros);
        }
        // after that, the program prints the smallest number
        
        int menor = list.get(0);
        for(int i = 0; i < list.size(); i++){
            int num = list.get(i); // se va guardando cada numero de la lista en num
            
            if(menor > num){
                menor = num;
            }
        }
        System.out.println("Smallest number: " + menor);
        
        // and its index -- the smallest number
        // might appear multiple times
        for(int x = 0; x < list.size(); x++){
            if(menor == list.get(x)){
                System.out.println("Found at index: " + x);
            }
        }        
    }
}
