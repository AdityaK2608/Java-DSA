//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class evenorodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(num%2==0){
            System.out.println("The given number is even.");
        }
        else{
            System.out.println("The given number is odd.");
        }
    }
}
