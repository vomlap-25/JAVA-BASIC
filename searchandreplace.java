import java.util.Scanner;

public class searchandreplace {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("First 'a': " + s.indexOf('a'));
        System.out.println("Last 'a': " + s.lastIndexOf('a'));

        System.out.println("Contains Java: " + s.contains("Java"));

        System.out.println("After replacement: " + s.replace('a', '@'));
    }
}