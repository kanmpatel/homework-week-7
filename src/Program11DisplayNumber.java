//print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class Program11DisplayNumber {
    public static void main(String[] args) {
        System.out.println("number divided by 3 in 1 to 100 is :");
        for(int i = 1; i<=100; i++){  //for loop for print the 1 to 10 0values
            if(i%3==0){
                System.out.println(i);
            }
        }

        System.out.println("number divided by 5 in 1 to 100 is :");
        for(int j = 1; j<=100; j++){
            if(j%5==0){
                System.out.println(j);
            }
        }
    }
}
