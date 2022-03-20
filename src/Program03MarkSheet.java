import java.util.Scanner;
//Create Mark sheet
public class Program03MarkSheet {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String StudentName = Input.next();
        System.out.print("Enter roll number Name : ");
        int rollNo = Input.nextInt();
        int Marks[] = new int[3];            // create array marks
        System.out.print("Enter mark of Maths : ");
        Marks[0] = Input.nextInt();
        System.out.print("Enter mark of Science : ");
        Marks[1] = Input.nextInt();
        System.out.print("Enter mark of English : ");
        Marks[2] = Input.nextInt();

        // subject mark is no between 0 to 100
        for (int i = 0; i < Marks.length; i++) {
            if (Marks[i] < 0 || Marks[i] > 100) {
                System.out.println("Invalid Marks number");
                break;
            }
        }

        //calculate total of marks
        int total = Marks[0] + Marks[1] + Marks[2];
        float percentage = (total * 100 / 300);   //calculate persentage of marks
        String Result;
        // declare a grade
        String Grade;
        if (percentage >= 80) {
            Result = "Pass";
            Grade = "A+";
        } else if (percentage <= 80 && percentage >= 60) {
            Result = "Pass";
            Grade = "A";
        } else if (percentage <= 60 && percentage >= 50) {
            Result = "Pass";
            Grade = "B";
        } else if (percentage <= 50 && percentage >= 35) {
            Result = "Pass";
            Grade = "C";
        } else {
            Result = "Pass";
            Grade = "Fail";
        }

        System.out.println("---------------------------------------------");
        System.out.println("|                                            |");
        System.out.println("|            Mark Sheet                      |");
        System.out.println("| Name       :   " + StudentName + "                       " + "|");
        System.out.println("| RollNo     :   " + rollNo + "                           " + "|");
        System.out.println("---------------------------------------------");
        System.out.println("| Subject    :         Marks                 |");
        System.out.println("---------------------------------------------");
        System.out.println("| Maths      :   " + Marks[0] + "                          " + "|");
        System.out.println("| Science    :   " + Marks[1] + "                          " + "|");
        System.out.println("| English    :   " + Marks[2] + "                          " + "|");
        System.out.println("---------------------------------------------");
        System.out.println("| Total      :   " + total + "" + "                         " + "|");
        System.out.println("---------------------------------------------");
        System.out.println("| Percentage :   " + percentage + "                        " + "|");
        System.out.println("| Result     :   " + Result + "                        " + "|");
        System.out.println("| Grade      :   " + Grade + "                          " + "|");
        System.out.println("---------------------------------------------");


    }
}
