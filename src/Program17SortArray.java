import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java program to sort a numeric array and a string array.

public class Program17SortArray {
    public static void main(String[] args) {
       int a[] = {50,48,60,84,10};
        System.out.println("Before sorting array");

       for(int i = 0;i<a.length;i++){
           System.out.println(a[i]);
       }
        //sort the number array using for loop
       for(int i = 0 ;i<a.length;i++){
           for(int j = i+1;j<a.length;j++){
               if(a[i]>a[j]){
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
       }
        // sort the string array
        System.out.println("After sorting array");

        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        List<String> stringList = new ArrayList<String>(); //define arraylist object
        stringList.add("w");
        stringList.add("z");
        stringList.add("a");
        stringList.add("y");
        stringList.add("m");
        Collections.sort(stringList);
        for(String str :stringList){
            System.out.println(str);
        }


    }
}
