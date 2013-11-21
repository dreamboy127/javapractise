/*************************************************************************
	> File Name: practise10.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Wed 20 Nov 2013 11:30:45 AM CST
 ************************************************************************/
public class practise10{
    public static void main(String[] args){
        double sum=0;
        double x=100;
        double f;
        int n=10;
        for(int i=0;i<n;i++)
        {
            f=x/2;
            sum=sum+x+f;
            x=f;
        }
        sum=sum-x;
        System.out.println("sum:"+sum);
        System.out.println("f:"+x);
    }
}
