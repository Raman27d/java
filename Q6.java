import java.util.Scanner;

class Q6{
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        String  charinput = myscan.next();
        if(charinput.length()!=1 ){
            System.out.print("Error");
            return;
        }
        if(charinput.charAt(0)-'a'<26 && charinput.charAt(0)-'a'>-1){
            System.out.print("a small case letter");
        }else if(charinput.charAt(0)-'A'<26 && charinput.charAt(0)-'A'>-1){
            System.out.print("Capital letter");
        }else if(charinput.charAt(0)-'0'<10 && charinput.charAt(0)-'0'>-1){
            System.out.print("a digit");
        }else {
            System.out.print("Symbol");
        }
        
    }
}