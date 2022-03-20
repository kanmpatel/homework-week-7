
import java.util.Arrays;
import java.util.Scanner;
//Java program to test if an array contains a specific value

public class Program20ContainsValuesArray{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter any value from array :");
        int found = Input.nextInt();
        boolean check = false; //set the boolean value false
         for(int element : a){         //for loop for each array element
             if(element == found){     //check the value of defined by user is in array or not
                 check = true;         //if value is an array boolean value true
                 break;                 //break the for loop
             }
         }
         //boolean is true then value is contain in array
         if(check){
             System.out.println(found + " is contains in array");
         } else {
             System.out.println(found + " is not contains in array");
         }

    }
}
