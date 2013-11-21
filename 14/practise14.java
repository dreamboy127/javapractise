/*************************************************************************
	> File Name: practise14.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 07:46:32 PM CST
 ************************************************************************/
import java.util.Scanner;
public class practise14{
    public static void main(String[] args){
        int daysOfmonth[][]={
                        {0,31,28,31,30,31,30,31,31,30,31,30,31},
                        {0,31,29,31,30,31,30,31,31,30,31,30,31}
        };
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        int month=scan.nextInt();
        int day=scan.nextInt();
        int flag=(year%4==100&&year%100!=0||year%400==0)?1:0;
        int sum=day;
        for(int i=0;i<month;i++)
            sum+=daysOfmonth[flag][i];
        System.out.println(sum);
    }
}
