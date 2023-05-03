import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //define variables
        int pear, apple, tomato, banana, aubergine;
        double total;

        //get the kilograms from the user
        Scanner input = new Scanner(System.in);
        System.out.print("How many kilos of pears: ");
        pear = input.nextInt();
        System.out.print("How many kilos of apples: ");
        apple = input.nextInt();
        System.out.print("How many kilos of tomatoes: ");
        tomato = input.nextInt();
        System.out.print("How many kilos of banana: ");
        banana = input.nextInt();
        System.out.print("How many kilos of aubergine: ");
        aubergine = input.nextInt();

        //do the math
        total = (pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (aubergine * 5.00);

        //print out
        System.out.println("Total Amount: " + total);
    }
}