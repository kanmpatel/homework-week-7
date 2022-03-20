import java.util.Scanner;

public class Program04DayInMonth {

    //create method with paratmeter year
    public static boolean isLeapYear(int year){
        // year is out of range retue false
        boolean a;
        if(year >= 1 && year <= 9999) {
            a = true;
            if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0) { // year in range then find year is leap year of not
                a = true;
                System.out.println(year + " year is leap year");
            } else {
                System.out.println(year + " year is not leap year");
            }
        } else {
            a = false;
            System.out.println(year + " the parameter is not in the range(1-9999)");
        }
        return a;
    }

    //getDaysInMonth with two parameter month and year. Both of type int.
    public static int getDaysInMonth(int month, int year){
        int day;
        //to fine the day in month using swich case
        switch (month){
            case 1:
                day = 31;
                break;
            case 2:
                boolean res = isLeapYear(year);
                if (res == true){
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
            case 5:
                day = 31;
                break;
            case 6:
                day = 30;
                break;
            case 7:
                day = 31;
                break;
            case 8:
                day = 31;
                break;
            case 9:
                day = 30;
                break;
            case 10:
                day = 31;
                break;
            case 11:
                day = 30;
                break;
            case 12:
                day = 31;
                break;
            default:
                day = -1;
        }
        return day;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in); // use scanner for input
        System.out.print("Enter the Year : ");
        int year1 = Input.nextInt();
        System.out.println(isLeapYear(year1)); //calling isleapyear static method with paratemeters
        System.out.print("Enter the month: ");
        int month1 = Input.nextInt();
        System.out.print("Enter the Year : ");
        int year2 = Input.nextInt();
        //calling getdaysinmonths static method with paratemeters
        System.out.println("Month " + month1 + " has " + getDaysInMonth(month1,year2) + "days");

    }

}
