public class stringcomparision {
     public static void main(String[] args) {

        String s1 = "hello world";
        String s2 = "hello java";

        System.out.println("Equal: " + s1.equals(s2));
        System.out.println("Ignore case: " + s1.equalsIgnoreCase(s2));

        int result = s1.compareTo(s2);

        if (result < 0)
            System.out.println("First comes first");
        else if (result > 0)
            System.out.println("Second comes first");
        else
            System.out.println("Both are equal");
    }
    
}
