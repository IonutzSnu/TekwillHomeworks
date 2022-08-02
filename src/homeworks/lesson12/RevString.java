package homeworks.lesson12;

public class RevString {
    public static void main(String[] args) {
        String myString = "Hello Tekwil";
        String reversedString = "";

        for (int i = myString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + myString.charAt(i);
        }
        System.out.println(reversedString);
    }
}
