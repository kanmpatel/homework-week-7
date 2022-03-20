import java.util.Scanner;
//check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
public class Program16PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = Input.nextInt();
        if(num == 0){   //checking zero number
            System.out.println(num+ " number is ZERO");
        } else if(num > 0){                 //checking posotive number
            System.out.println(num+ " number is POSITIVE”,");
        } else {                          //checking negative number
            System.out.println(num+ " number is NEGATIVE”");
        }
    }
}
