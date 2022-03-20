import java.util.Scanner;
//input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
public class Program05GrossSalary {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        int eid = Input.nextInt();
        System.out.print("Enter Employee Name : ");
        String name = Input.next();
        System.out.print("Enter Employee Salary : ");
        int salary = Input.nextInt();

        float hra = (salary*10/100); //HRA 10%
        float da = (salary*8/100);  //TA 8%
        float ta = (salary*9/100);  //DA 9%
        float pf = (salary*20/100); //PF -20%

        float grossSalary = salary + hra + ta + da - pf;

        System.out.println("-----------------------------------");
        System.out.println("|          Salary Slip            |");
        System.out.println("|                                 |");
        System.out.println("| Empolyee Id   : " +eid +"            |");
        System.out.println("| Empolyee name : " +name +"              |");
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("| Basic Salary  : " +salary+"               |");
        System.out.println("| HRA 10%       : " +hra+"         |");
        System.out.println("| TA 8%         : " +ta+"         |");
        System.out.println("| DA 9%         : " +da+"         |");
        System.out.println("| PF -20%       : " +pf+"         |");
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("| Gross Salary  : " +grossSalary+"             |");
        System.out.println("|---------------------------------|");
        System.out.println("|---------------------------------|");



    }
}
