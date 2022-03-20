import java.util.Scanner;
//alphabet from “A" to “F” and print their city name accordingly using switch case
public class Program09CityNameWithSwitchCase {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Any alphabet between A TO F :");
        char alpha = Input.next().charAt(0);
        //switch case statememts
        switch (alpha){
            case 'A':
                System.out.println("Ahemdabad");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Channai");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("England");
                break;
            case 'F':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Alphbets");
        }
    }
}
