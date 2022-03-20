import java.util.Scanner;
//number is odd or even
public class Program01OddEven {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = Input.nextInt();

        //number is odd or even
        if(a % 2 == 0){
            System.out.println(a + "number is Even");
        } else {
            System.out.println(a + "number is Odd");
        }

    }
}
