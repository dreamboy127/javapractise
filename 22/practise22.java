/*************************************************************************
	> File Name: practise22.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 09:07:19 PM CST
 ************************************************************************/
public class practise22{
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
    static int factorial(int n)
    {
        if(n==1)
            return n;
        return n*factorial(n-1);
    }
}
