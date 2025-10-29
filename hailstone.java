//Jack G 10/29/25
//finds hailsone numbers
import java.util.Scanner;
public class hailstone {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("pick a number 1 through 200");
        int num = scan.nextInt();
        System.out.println("num of iterations " + algorithm(num));  
        for(int i = 200; i >= 1; i--){
            System.out.println("num used " + i + " num of iterations " + algorithm(i));
        }
    }
    public static int algorithm(int number){
        int count =0;
        while (number != 1){

            if (number % 2 == 0){
                number /= 2;
            }
            else{
                number*=3;
                number+=1;
            }
            //System.out.println(number);
            count++;
          }
          return count; 
    }
}
