import java.util.Scanner;
public class Input_of_char_and_string {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("The character is: "+ c);
        
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc2.nextLine();
        System.out.println("The string is: "+ s);

    }
}
