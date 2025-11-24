import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a number: ");

        String userNumber = myObj.nextLine();
        int number = Integer.parseInt(userNumber);

        int both =(number % 3 + number % 5);
        int three =(number % 3);
        int five =(number % 5);

        String message = (both == 0) ? "FizzBuzz"
                        : (three == 0) ? "Fizz"
                        : (five == 0) ? "Buzz"
                        : "Number " + number + " does not divide with 3 nor 5";
        System.out.println(message);


    }
}