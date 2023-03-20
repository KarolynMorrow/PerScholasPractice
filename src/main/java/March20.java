import java.util.Scanner;

public class March20 {
    public static void main(String[] args) {
        double x, y;
        char operator;
        System.out.println("Please enter values and arithmetic operator like: 2 + 6 or 5 - 4 or 2 * 6 or 10 - 2");
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        operator = input.next().charAt(0);
        y = input.nextDouble();
        //String regex = "(?<=[-+*/()])|(?=[-+*/()])";
        //System.out.println(operator);
        if(operator == '+'){
            System.out.println("Your total is: " + (x + y));
        } else if(operator == '-'){
            System.out.println("Your difference is: " + (x - y));
        } else if(operator == '*'){
            System.out.println("Your product is: " + (x * y));
        } else if(operator == '/') {
            System.out.println("Your quotient is: " + (x/y));
        } else{
            System.out.println("Invalid operator inserted");
        }

        math();


    }




    public static void math(){
        int y = (10 % 3) * 5;
        int x = 4 / 2 + 8 * 4 - ( 5+ 2 ) % 3;
        System.out.println(y);
        System.out.println(x);
    }
}

