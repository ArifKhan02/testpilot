package Everyday_Practice;

public class ConcatenateTwoString_withoutUsingConcateOperation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result = concatenateStrings(str1, str2);

        System.out.println(result);
    }

    private static String concatenateStrings(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1).append(str2);
        return stringBuilder.toString();
        
    }
}
