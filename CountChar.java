import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter character: ");
        char target = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target)
                count++;
        }

        System.out.println("Count: " + count);

        sc.close();
    }
}