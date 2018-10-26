import java.util.Scanner;

public class Sayhello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur name:");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
