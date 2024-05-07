public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int altura = 1;
        while(altura <= size){
            printSpaces(size - altura);
            printStars(altura);
            altura++; 
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int estrella = 1;
        int altura = 1;
        while(altura <= height){
            printSpaces(height - altura);
            printStars(estrella);
            estrella += 2;
            altura++;  
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
