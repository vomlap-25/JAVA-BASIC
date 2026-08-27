public class searchandreplace {

public static void main(String[] args) {
        String s = "hello java";

        System.out.println("First 'a': " + s.indexOf('a'));
        System.out.println("Last 'a': " + s.lastIndexOf('a'));

        System.out.println("Contains Java: " + s.contains("Java"));

        System.out.println("After replacement: " + s.replace('a', '@'));
    }
}