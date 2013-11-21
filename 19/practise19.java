/*************************************************************************
	> File Name: practise19.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 08:42:54 PM CST
 ************************************************************************/
public class practise19{
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i*2+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=i*2+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
