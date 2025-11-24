import java.util.Scanner;

public class Number{
    public static void main(String[] args){
        int sum = 0;
        while(true){
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter number : ");

        int ans = calc.nextInt();
        if(ans == 0){
            break;
        }else if(ans < 0){
            System.out.println("Negatīvs skaitlis ignorēts");
            continue;
        }else if(ans > 100){
            System.out.println("Skaitlis > 100 - cikls apturēts");
            break;
        }else{
            System.out.println("Skatilis " + ans + " pieskaitīts");
            sum += ans;
            System.out.println("Rezultāts : " + sum);
            continue;
        }
        }
    }
}
