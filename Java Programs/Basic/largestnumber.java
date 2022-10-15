/*Take 2 numbers as input and print the largest number.*/
import java.util.*;
public class largestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        a = in.nextInt();
        b= in.nextInt();
        if(a>b){
            System.out.println("A is largest number");
        }
        else{
            System.out.println("B is largest number");
        }
    }
}
