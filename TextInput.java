import java.util.Scanner;


// public class TextInput{
//     public static void main(String[] args){
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Enter text");

//         String userText = myObj.nextLine();

//         System.out.println("User text: " + userText);
//     }
// }


// public class Number{
//     public static void main(String[] args){
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Enter a number");

//         String userNumber = myObj.nextLine();

//         int userNum = Integer.parseInt(userNumber);
//         int total = (userNum % 2);

//         if (total == 0){
//             System.out.println("Your chosen number is even");
//         } else {
//             System.out.println("Your chosen number is odd");
//         };
//     }
// }
public class Number{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");

        String userNumber = myObj.nextLine();

        int userNum = Integer.parseInt(userNumber);
        int total = (userNum % 2);

        String result = (total == 0) ? "Your chosen number is even" : "Your chosen number is odd";
        System.out.println(result);
    }
}
