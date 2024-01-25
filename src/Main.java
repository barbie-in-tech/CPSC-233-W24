import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

        char continueChoice;
        // I used do-while here, but you can use other loops as well.
        // Since do-while will execute the first iteration irrespective of whether the condition is True or not, this makes it perfect for this scenario
        do {
            // Taking input from the user
            System.out.print("Enter a positive integer (N): ");
            int n = scanner.nextInt();

            // Menu
            System.out.println("Choose an option:");
            System.out.println("1) Find if number is even or odd");
            System.out.println("2) Find if number is prime or not");
            System.out.println("3) Find the factorial value of the number");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkEvenOdd(n);
                    break;
                case 2:
                    checkPrime(n);
                    break;
                case 3:
                    calculateFactorial(n);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }

            System.out.print("Do you want to continue (Y/N)? ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y'); //Takes care of both upper and lower case

    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }

    public static void checkPrime(int n) {
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }


    public static void calculateFactorial(int num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}