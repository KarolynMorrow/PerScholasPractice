import java.util.Scanner;

public class gitHomework {

    public static void main(String[] args) {

        System.out.println("Hello world, This is practice for commit. This is the first commit updated during the third commit");
        secondCommit();
        thirdCommit();
        addScanner();


    }

    public static void secondCommit(){
        System.out.println("This is considered the second commit.");
    }

    public static void thirdCommit(){
        System.out.println("This is the third and final commit.");
    }

    public static void addScanner(){
        Scanner input = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Input two strings to get the length:");
        int length1 = input.nextLine().length();
        int length2 = inputTwo.nextLine().length();
       if (length1 + length2 % 2 == 0){
           System.out.println("Even number");
       } else {
           System.out.println("Odd number");
       }
    }
}
