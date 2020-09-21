import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 65 && ch <= 90){
            return (char)(ch + 32);
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            newStr += toLower(str.charAt(i));
        }
        return newStr;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch >= 97 && ch <= 122){
            return (char)(ch - 32);
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            newStr += toUpper(str.charAt(i));
        }
        return newStr;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Would you like to make your string lowercase or uppercase?");
        String type = scan.nextLine();
        if (type.equals("lowercase")){
            System.out.println(myToLowerCase(str));
        }
        else if (type.equals("uppercase")){
            System.out.println(myToUpperCase(str));
        }
        else {
            System.out.println("Invalid input");
        }
        scan.close();
    }
}
