import java.util.Scanner;

public class gitHomework {

    public static void main(String[] args) {

        System.out.println("Hello world, This is practice for commit. This is the first commit updated during the third commit");
        secondCommit();
        thirdCommit();
        scannerInput();
        evenOddStrings();

    }

    public static void secondCommit() {
        System.out.println("This is considered the second commit.");
    }

    public static void thirdCommit() {
        System.out.println("This is the third and final commit.");
    }

    public static void scannerInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two strings to add the lengths:");
        String firstString = input.nextLine();
        String secondString = input.nextLine();

    }

    public static int addInput(String firstString, String secondString){
        int total = firstString.length() + secondString.length();
        return total;
    }
    public static void evenOddStrings(int total) {
        if (total % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
