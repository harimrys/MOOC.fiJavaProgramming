import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        String primero = list.get(0);
        int valuesSize = list.size();
        String ultimo = list.get(valuesSize - 1);
        
        System.out.println(primero);
        System.out.println(ultimo);

    }
}
