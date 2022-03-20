import java.util.Scanner;

//alphabet from “A" to “F” and print their city name accordingly using if else
public class Program08CityNameWithAlphabets {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Any alphabet between A TO F :");
        char alpha = Input.next().charAt(0);
        //Nested If Else
        if(alpha == 'A'){
            System.out.println("Ahemdabad");
        } else if(alpha == 'B'){
            System.out.println("Baroda");
        } else if(alpha == 'C'){
            System.out.println("Channai");
        } else if(alpha == 'D'){
            System.out.println("Delhi");
        } else if(alpha == 'E'){
            System.out.println("England");
        } else if(alpha == 'F'){
            System.out.println("France");
        } else {
            System.out.println("Invalid Alphabet");
        }




    }



}
