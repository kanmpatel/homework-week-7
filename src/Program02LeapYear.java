import java.util.Scanner;

public class Program02LeapYear {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int year = Input.nextInt();
        if((year % 4 == 0 || year % 400 == 0) && (year % 100 != 0)){
            System.out.println(year +" Year is Leap Year");
        } else {
            System.out.println(year +" Year is not Leap Year");
        }
    }

}
