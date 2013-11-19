/*************************************************************************
	> File Name: practise07.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 03:50:49 PM CST
 ************************************************************************/
package practise07;
public class practise07{
    public static void main(String[] args){
        int i=0;
        int num[]=null;
        num=new int[256];
        char[] str=args.toCharArray();
        while(str[i]!='\n')
        {
            num[str[i]]++;
            i++;
        }
        for(i=0;i<256;i++)
        {
            System.out.println("the "+(byte)i+":"+num[i]);
        }
    }
}
