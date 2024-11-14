import java.util.Scanner;

public class PalCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String raw = in.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(isPal(raw) ? "Palindrome!" : "Not a Palindrome.");
    }

    private static boolean isPal(String txt) {
        for (int i = 0, j = txt.length() - 1; i < j; i++, j--) {
            if (txt.charAt(i) != txt.charAt(j)) return false;
        }
        return true;
    }
}
