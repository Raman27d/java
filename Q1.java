import java.util.Scanner;

class Q1{
    public static void main(String[] args){
        Scanner no_scan= new Scanner(System.in);
        System.out.print("Enter a no. to check it a palindrome");
        int check_no = no_scan.nextInt();
        int temp1=check_no;
        int temp2=0;
        int add=0;
        if (temp1>=0){
            int x=0;
            while(temp1!=0){
                x=temp1%10;
                if(x%2==0){
                    add+=x;
                }
                temp2=(temp2*10)+x;
                temp1=temp1/10;
            }
        }
        if(check_no==temp2){
            System.out.print(check_no+ " is a palindrome ");
        }else{
            System.out.print(check_no +" is not a palindrome ");
        }
        if(add>25){
            System.out.print("and sum of even numbers is greater than 25.");
        }else{
            System.out.print("and sum of even numbers is less than or equal to 25.");
        }

    }
}