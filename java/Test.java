import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        System.out.println("Hello world");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=s.nextInt();
        System.out.println("You have entered "+number);
        System.out.println("New Element added");
    }
}