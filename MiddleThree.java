import java.util.Scanner;

public class MiddleThree{
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string with odd number of letters: ");
        String str1 = keyboard.nextLine();

        int len = str1.length();
        int mid = len/2;

        String middleThree = str1.substring(mid-1, mid+2);
        System.out.println("Middle three letters are " + middleThree);
        
    }
}