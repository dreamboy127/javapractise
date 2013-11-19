/*************************************************************************
	> File Name: practise03.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 03:17:31 PM CST
 ************************************************************************/
public class practise03{
    public static void main(String[] args){
        for(int i=100;i<1000;i++)
        {
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            if(i==a*a*a+b*b*b+c*c*c)
                System.out.println(i);
        }
    }
}
