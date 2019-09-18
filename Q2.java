import java.util.Scanner;

class Q2{
    public static void main(String[] args){
        Scanner no_scan=new Scanner(System.in);
        System.out.print("Enter a no. ");
        int check_no= no_scan.nextInt();
        if (check_no<31 && check_no>19){
            if(check_no%2== 0){
                System.out.println("Jerry");
            }else{
                System.out.println("Tom");
            }
        }
    }
}