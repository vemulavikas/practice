// You are using Java
import java.util.*;
class Smallest_psbl_num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=sc.nextInt();
        int r=1;
        for(int i=1;i<n;i++)
        r*=10;
        int sum=0,j=0;
        for( j=r;j<r*10;j++){
            sum=0;
            int temp=j;
             while (temp!=0) {
                sum=temp%10;
                temp=temp/10;
             }
            if(sum==num)
            break;
        }
        if(sum==num)
        System.out.println("Smallest number is "+j);
        else
        System.out.println("Not possible");
    }
}