public class March9th {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        firstName = "Karolyn";
        lastName = "Morrow";

        //practicing gitignore

        System.out.println("The length of my first name is " + firstName.length() + " characters and the length of my last name is " + lastName.length() + " characters.");
        computeAreaOfRectangle();
    }

    public static void computeAreaOfRectangle(){
        int length = 2;
        int width = 5;
        System.out.println("The area of a rectangle with a length of: " + length + " and a width of: " + width + " equals " + length * width);
    }
}
