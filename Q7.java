import java.util.Scanner;

class Q7{
    public static void main(String[] args){
        Scanner myscan= new Scanner(System.in);
        int num = myscan.nextInt();
        int[] array ={0,0,0,0,0,0,0,0,0,0};
        int digit;
        while(num!=0){
            digit=num%10;
            array[digit]++;
            num/=10;
        }
        long ans=0;
        for(int x=9;x>-1;x--){
            for(int y=0; y<array[x]; y++){
                ans=ans*10+x;
            }
        }
        System.out.print(ans);
    }
}