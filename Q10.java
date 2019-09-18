import java.util.Scanner;

class Q10{
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        String str = myscan.next();
        Scanner num_scan= new Scanner(System.in);
        int num = num_scan.nextInt();
        String str2=str;
        if(num<str.length()){
            str2=str2.substring(str.length()-num);
        }
        for(int i=0;i<num;i++){
            str+=str2;
        }
        System.out.print(str);
    }
}