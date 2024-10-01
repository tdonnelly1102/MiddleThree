import java.util.Scanner;

public class MiddleThree{
    public static void main(String[] args){
        System.out.println("Hello world");
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.println("Hello, " + name);
    }
}