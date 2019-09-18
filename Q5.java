import java.util.Scanner;

class Q5{
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        String  strinput = myscan.nextLine();
        int n=strinput.length();
        int i=0;
        int ans=0;
        while(i<n){
            int no=0;
            while(i<n && (strinput.charAt(i))!=' ' ){
                if((strinput.charAt(i)-'0'<10) && (strinput.charAt(i)-'0')>-1){
                    no=no*10+(strinput.charAt(i)-'0');
                    i++;
                }else{
                    return ;
                }
            }
            i++;
            ans+=no;
        }
        System.out.print(ans);
    }
}