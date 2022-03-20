//Java program to sum values of an array
public class Program18SumOfArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        int sum = 0;
        for(int i=0; i< a.length; i++){
            sum = sum + a[i];        //calculate sum of array by add one value of every loop
        }
        System.out.println("sum of an array is : " +sum);
    }
}
