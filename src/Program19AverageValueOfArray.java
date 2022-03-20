import java.util.Scanner;
//Java program to calculate the average value of array elements
public class Program19AverageValueOfArray {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("enter the length of array :");
        int l = Input.nextInt();
        int a[] = new int[l];    //declare array
        //input the value from user in array
        int sum = 0;
        for(int i=0; i<a.length;i++){
            System.out.print("index of a[" + i + "] : " );
            a[i] = Input.nextInt();
            sum = sum + a[i];
        }
        System.out.println("sum of an array is : " +sum);
        System.out.println("sum of an array is : " +(sum/l));  //calcuate total average

    }
}
