/*************************************************************************
	> File Name: practise07.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 03:50:49 PM CST
 ************************************************************************/
import java.io.*;
public class practise07{
    public static void main(String[] args) throws Exception{
        int num[]=null;
        num=new int[127];
        StringBuffer buf=new StringBuffer();
        System.out.println("请输入内容：");
        int temp=0;
        while((temp=System.in.read())!=-1)
        {
            char c=(char)temp;
            if(c=='\n')
                break;
            buf.append(c);
        }
        System.out.println(buf.length()+":"+buf);
        for(int i=0;i<buf.length();i++)
        {
            num[buf.charAt(i)]++;
        }
        for(int i=0;i<127;i++)
        {
            char ch=(char)i;
            System.out.println("the "+ch+":"+num[i]);
        }
    }
}
