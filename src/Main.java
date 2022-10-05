import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         boolean userAnswerMaster = true;
         int[] ints = new int[2];

         while(userAnswerMaster){
             displayMenu();
             Scanner scan = new Scanner(System.in);

             System.out.print("Please enter an operation: ");
             char userAnswer = scan.next().charAt(0);
             scan.nextLine();
            if(userAnswer == 'a' || userAnswer == 'A'){
                ints = getUserValues();
                addition(ints[0], ints[1]);
            }else if(userAnswer == 's' || userAnswer == 'S'){
                ints = getUserValues();
                subtraction(ints[0], ints[1]);
            }else if(userAnswer == 'm' || userAnswer == 'M'){
                ints = getUserValues();
                multiplication(ints[0], ints[1]);
            }else if(userAnswer == 'd' || userAnswer == 'D'){
                ints = getUserValues();
                division(ints[0],ints[1]);
            }else{
                System.out.println("Please enter a valid input, Thank you");
                main(null);
            }

            System.out.print("Would you like to perform another operation (y/n): ");

            char temp = scan.next().charAt(0);
            scan.close();

            if(temp == 'y' || temp == 'Y'){
                userAnswerMaster = true;
            }else if(temp == 'n' || temp == 'N'){
                System.out.println("You have selected to exit, Thank you, have a nice Day Burd Brain.");
                userAnswerMaster = false;
            }else{
                System.out.println("You're not very good at following directions, Exiting......");
                userAnswerMaster = false;
            }
         }

    }

    public static int[] getUserValues(){
        int[] ints = new int[2];

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a integer value for A: ");
        ints[0] = scan.nextInt();
        System.out.println();

        System.out.print("Please enter an integer value for B: ");
        ints[1] = scan.nextInt();
        System.out.println();

        scan.close();
        return ints;

    }

    public static void displayMenu(){
        System.out.print("Welcome to the CLI Calculator\n");
        System.out.println("Operations: ");
        System.out.println();
        System.out.println("    a: Addition");
        System.out.println("    s: Subtraction");
        System.out.println("    m: Multiplication");
        System.out.println("    d: Division");
        System.out.println("    e: Exit");
        System.out.println();
    }

    public static void addition(int a, int b){
        System.out.println("The sum of " + a + " + " + b + " = " + (a+b));
    }

    public static void subtraction(int a, int b){
        System.out.println("The difference of " + a + " - " + b + " = " + (a-b));
    }

    public static void multiplication(int a, int b){
        System.out.println("The multiplication of " + a + " " + " * " + b + " = " + (a*b));
    }

    public static void division(int a, int b){
        int[] temp = new int[2];
        if(b == 0){
            System.out.println("Please enter a valid denominator, can not divide by Zero");
            temp = getUserValues();
            division(temp[0],temp[1]);
        }else{
            float answer = ((float)a)/((float)b);
            System.out.printf("The division of " + a + " " + " / " + b + " =  %.2f" + "\n", answer);

        }
    }
}
