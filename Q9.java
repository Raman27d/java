import java.util.Scanner;

class Q9{
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        String str = myscan.next();
        String ans="";
        for(int i=str.length()-1;i>-1;i--){
            ans=ans+str.substring(i, i+1);
        }
        System.out.println(ans);
    }
}