import java.util.Scanner;
//program that tells us input value is number or an alphabet or symbol.
public class Program12NumberAlphabetSymbols {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter any Value : ");
        char ch = Input.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){  //checking value is Alphabets or not
            System.out.println("Value is Alphabets");
        } else if((ch>='0' && ch<='9')){                   //checking value is number or not
            System.out.println("Value is Numbers");
        } else {                                          //checking value is symbol or not
            System.out.println("Value is Symbol");
        }
    }
}
