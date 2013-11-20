/*************************************************************************
	> File Name: practise08.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 07:47:02 PM CST
 ************************************************************************/
import java.io.*;
public class practise08_02{
    public static void main(String[] args) throws Exception{
        int a,b;
        BufferedReader buf=null;
        buf=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("a:");
        str=buf.readLine();
        a=Integer.parseInt(str);
        System.out.println("b:");
        str=buf.readLine();
        b=Integer.parseInt(str);
        System.out.println("a:"+a+"  b:"+b);
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
