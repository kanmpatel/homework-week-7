import java.util.Scanner;
//Java program which input any number between 1 to 7 and
// it print The Days name MONDAY, TUESDAY…..SUNDAY
public class Program13WeekDaysUsingSwitch {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter any week : ");
        int week = Input.nextInt();
        //switch case statements
        switch (week){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
