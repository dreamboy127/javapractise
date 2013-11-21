/*************************************************************************
	> File Name: practise20.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 09:00:31 PM CST
 ************************************************************************/
public class practise20{
    public static void main(String[] args)
    {
        double sum=2.0;
        for(int i=2;i<=20;i++)
        {
            sum+=(i+i-1)/i;
        }
        System.out.println(sum);
    }
}
