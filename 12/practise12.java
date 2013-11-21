/*************************************************************************
	> File Name: practise12.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 03:47:33 PM CST
 ************************************************************************/
import java.util.Scanner;
public class practise12{
    public static void main(String[] args){
        double sum[]={0.0,1.0,1.75,2.75,3.35,3.95};
        double m[]={0.0,10.0,20.0,40.0,60.0,100.0};
        double cost[]={0.10,0.075,0.05,0.03,0.015,0.01}; 
        int index=0;
        double x=10.0;
        Scanner scan=new Scanner(System.in);
        x=scan.nextFloat();
        if(x<10.0)
            index=0;
        else if(x<20.0)
            index=1;
        else if(x<40.0)
            index=2;
        else if(x<60.0)
            index=3;
        else if(x<100.0)
            index=4;
        else
            index=5;
        System.out.println(sum[index]+cost[index]*(x-m[index]));
    }
}
