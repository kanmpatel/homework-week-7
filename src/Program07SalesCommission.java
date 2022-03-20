import java.util.Scanner;
//java program input sales id, seller's name, sales amount,
// and salary basic and then fined this sales
public class Program07SalesCommission {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Sales ID :");
        int sid = Input.nextInt();
        System.out.print("Enter Seller's Name :");
        String sname = Input.next();
        System.out.print("Enter sales amount :");
        int samount = Input.nextInt();
        System.out.print("Enter basic salary :");
        int salary = Input.nextInt();
        int sales;
        //Nested If Else
        if(samount>=50000){
            System.out.println("sales is 35% :" + (samount*35/100)); //sales amount of 35%
        } else if(samount<=50000 && samount>=30000){
            System.out.println("sales is 20% :" + (samount*20/100)); //sales amount of 20%
        } else if(samount<=30000 && samount>=20000){
            System.out.println("sales is 20% :" + (samount*10/100)); //sales amount of 10%
        } else if(samount<=20000 && samount>=10000){
            System.out.println("sales is 20% :" + (samount*5/100)); //sales amount of 5%
        } else if(samount<10000){
            System.out.println("sales is 20% :" + (samount*2/100)); //sales amount of 2%
        } else {
            System.out.println("Invalid sales Amount");
        }

    }
}
