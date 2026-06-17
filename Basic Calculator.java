import java.util.Scanner;
public class experiment {

    public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);
            int result = 0;
            double resultForDivision = 0;
            System.out.println("********Hello, welcome to XERO CODE DOMAIN********");
            System.out.print("Enter you email address:");
            String email = scanner.nextLine();
            email = email.substring(0, email.indexOf("@"));
            String name = email.toUpperCase();
            System.out.println("Hello Mr. " + name);
            System.out.print("How many calculation do you need?\n");
            int totalC = scanner.nextInt();
            int i;
            for(i=0;i<totalC;i++){
                System.out.println("***Choose your calculation type from below (1-4)***");
                System.out.print("1)Addition two integers\n2)Substraction of two integers\n3)Multiplications for two integers\n4)Division of two values\n");
                int typeC = scanner.nextInt();
                switch(typeC){
                    case 1 -> {
                        System.out.println("You have chosen addition");
                        System.out.println("Please enter your first integer");
                        int x = scanner.nextInt();
                        System.out.println(" ");
                        System.out.println("Please enter your second integer");
                        int y = scanner.nextInt();
                        result = addition(x, y);
                        System.out.println("*****Your result for addition is " + result +"*****");

                    }
                    case 2 -> {
                        System.out.println("You have chosen substraction");
                        System.out.println("Please enter your first integer");
                        int x = scanner.nextInt();
                        System.out.println(" ");
                        System.out.println("Please enter your second integer");
                        int y = scanner.nextInt();
                        result = substraction(x, y);
                        System.out.println("*****Your result for substraction is " + result +"*****");

                    }
                    case 3 -> {
                        System.out.println("You have chosen multiplication");
                        System.out.println("Please enter your first integer");
                        int x = scanner.nextInt();
                        System.out.println(" ");
                        System.out.println("Please enter your second integer");
                        int y = scanner.nextInt();
                        result = multiplication(x, y);
                        System.out.println("*****Your result for multiplication is " + result +"*****");

                    }
                    case 4 -> {
                        System.out.println("You have chosen division");
                        System.out.println("Please enter your first double");
                        double x = scanner.nextDouble();
                        System.out.println(" ");
                        System.out.println("Please enter your second double");
                        double y = scanner.nextDouble();
                        resultForDivision = division(x, y);
                        System.out.println("*****Your result for division is " + resultForDivision +"*****");

                    }
                    default -> {
                        System.out.println("Invalid input please try again!!");
                        i = i - 1;
                    }
                }
            }
            scanner.close();
        }
    //For addition
    static int addition (int x, int y){
        return (x+y);
    }
    //For substraction
    static int substraction (int x, int y) {
        return (x - y);
    }
    static int multiplication (int x, int y) {
        return (x*y);
    }
    //For division
    static double division (double x, double y) {
        return (x/y);
    }
    }
