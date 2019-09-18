import java.util.Scanner;

class Q3{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String myscan=scan.next();
        int length=myscan.length(), i=0;
        while(i<length){
            if(myscan.charAt(i)=='a' ||myscan.charAt(i)=='e' ||myscan.charAt(i)=='i' ||myscan.charAt(i)=='o' ||myscan.charAt(i)=='u'){
                System.out.print("vowel");
            }else if(((myscan.charAt(i)-'a')<26 && (myscan.charAt(i)-'a'>-1)) || ((myscan.charAt(i)-'A')<26 && (myscan.charAt(i)-'A'>-1))){
                System.out.print("consonant ");
            }else{
                System.out.print("error");
            }
            if(length!=i){System.out.print(" ");}
            i++;
        }
    }
}