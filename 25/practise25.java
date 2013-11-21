/*************************************************************************
	> File Name: practise25.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 09:17:34 PM CST
 ************************************************************************/
import java.util.Scanner;
public class practise25{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean flag=true;
        if(n/10000==n%10&&n/1000%10==n/10%10)
            System.out.println(n+" is huiwen");
        else
            System.out.println(n+" is not huiwen");
    }
}
