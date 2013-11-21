/*************************************************************************
	> File Name: practise21.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 09:03:53 PM CST
 ************************************************************************/
public class practise21{
    public static void main(String[] args){
        int i;
        int x=1;
        int sum=0;
        for(i=1;i<=20;i++)
        {
            x*=i;
            sum+=x;
        }
        System.out.println(sum);
    }
}
