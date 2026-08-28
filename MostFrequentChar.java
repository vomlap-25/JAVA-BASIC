import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char maxChar = s.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = s.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
        sc.close();
    }
   
}