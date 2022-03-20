import java.util.Scanner;
//find addition, Subtraction, multiplication and division according to their symbol
public class Program10AritmeticOpreation {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The first Number :");
        int a = Input.nextInt();
        System.out.print("Enter The second Number :");
        int b = Input.nextInt();
        System.out.print("Enter Arthmatic Oprators :"); //input the symbol
        char op = Input.next().charAt(0);

        if(op == '+'){
            System.out.println("addition of two number is : " +(a+b)); //addition
        } else if(op == '-'){
            System.out.println("substraction of two number is : " +(a-b)); //substraction
        } else if(op == '*'){
            System.out.println("multiplication of two number is : " +(a*b)); //multiplication
        } else if(op == '/'){
            System.out.println("division of two number is : " +(a/b)); //division
        } else {
            System.out.println("Invalid Oprators");
        }


    }
}
