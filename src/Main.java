import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first_name = scan.nextLine();

        System.out.println("Enter last name: ");
        String last_name = scan.nextLine();

        System.out.println("_________________");
        System.out.println("Welcome: "+first_name  +" " + last_name );

    }
}