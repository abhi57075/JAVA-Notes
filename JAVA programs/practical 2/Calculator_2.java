import java.util.Scanner;
public class Calculator_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to continue, -1 to exit ");
        byte x = sc.nextByte();

        while (x != -1) {
            System.out.println("Choose one of the following operations. ");
            System.out.println("Type 1: For addition ");
            System.out.println("Type 2: For subtraction ");
            System.out.println("Type 3: For multiplication ");
            System.out.println("Type 4: For division ");
            System.out.println("Type 5: For remainder ");
            System.out.println("Type 6: Factorial ");
            System.out.println("Type -1: To exit ");

            Scanner sc2 = new Scanner(System.in);
            byte choice = sc2.nextByte();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter 2 numbers: ");
            double a = sc3.nextDouble();
            double b = sc3.nextDouble();

            double result = 0;

            result = switch(choice) {
                case 1 -> (a + b);
                case 2 -> (a - b);
                case 3 -> (a * b);
                case 4 -> (a / b);
                case 5 -> (a % b);
                case 6 -> {
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Type 1 for factorial of 1st number and type 2 for factorial of 2nd number : ");
                    byte y = sc4.nextByte();
                    long fact = 1;
                    long ans = 1;
                    ans = switch(y) {
                        case 1 -> {
                            for (int i = 1; i <= a; i++) {
                                fact *= i;
                            }
                            yield fact;
                        }
                        case 2 -> {
                            for (int i = 1; i <= b; i++) {
                                fact *= i;
                            }
                            yield fact;
                        }
                        default -> -1;
                    };
                    yield fact;
                }
                default -> -1;
            };
            System.out.println("RESULT : " + result);
            Scanner sc5 = new Scanner(System.in);
            System.out.println("Enter 1 to continue, -1 to exit ");
            x = sc5.nextByte();
        }
    }
}

