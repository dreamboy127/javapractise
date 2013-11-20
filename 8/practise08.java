/*************************************************************************
	> File Name: practise08.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 07:47:02 PM CST
 ************************************************************************/
import java.io.*;
public class practise08{
    public static void main(String[] args) throws Exception{
        int a,b;
        System.out.println("a:");
        a=System.in.read();
        a=a-'0';
        System.in.read();
        System.out.println("b:");
        b=System.in.read();
        b=b-'0';
        System.out.println("a:"+a+"b:"+b);
        int sum=0;
        int temp=0;
        for(int i=0;i<b;i++)
        {
            temp=temp*10+a;
            sum+=temp;
        }
        System.out.println(sum);
    }
}
