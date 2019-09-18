import java.util.Scanner;

class Q4{
    public static void main(String[] args){
        Scanner myscan = new Scanner(System.in);
        int iteration_no=myscan.nextInt();
        for(int i=1; i<=iteration_no; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
        }
    }
}