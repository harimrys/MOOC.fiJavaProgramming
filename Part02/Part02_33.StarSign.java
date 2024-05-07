public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int number = 1;
        while(number <= size){
            printStars(size);
            number++;
            
        }
    }

    public static void printRectangle(int width, int height) {
        
        int altura = 1;
        
        while(altura <= height){
            printStars(width);
            altura++;       
        }
    }

    public static void printTriangle(int size) {
        int altura = 0;
        while(altura <= size){
            printStars(altura);
            altura++;
        }
    }
}
