import java.util.Random;
import java.util.Scanner;

class Q8{
    public static void main(String[] args){
        Random rand = new Random();
        int rand_num = rand.nextInt(50);
        while(true){
            System.out.print("Enter a no.");
            Scanner myscan= new Scanner(System.in);
            int num = myscan.nextInt();
            if(num>rand_num){
                System.out.println("Number guessed is more than original number");
            }else if(num<rand_num){
                System.out.println("Number guessed is less than original number");
            }else{
                System.out.println("Number guessed matches the original number");
                return;
            }
        }
    }
}