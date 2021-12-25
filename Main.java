import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String Department, sec;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Department: ");

        Department = input.nextLine();

        System.out.println();

        System.out.println("Enter your Sec: ");

        sec = input.nextLine();

        System.out.println();

        System.out.println("Your Department is: " + Department);

        System.out.println("Your Secton is:" + sec);

        System.out.println("This is "+Department+" department and the section is "+sec);

    }
}