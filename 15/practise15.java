/*************************************************************************
	> File Name: practise15.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 08:02:08 PM CST
 ************************************************************************/
import java.util.Scanner;
public class practise15{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x[]=new int[1];
        x[0]=scan.nextInt();
        int y[]=new int[1];
        y[0]=scan.nextInt();
        int z[]=new int[1];
        z[0]=scan.nextInt();
        if(x[0]<y[0])swap(x,y);
        if(x[0]<z[0])swap(x,z);
        if(y[0]<z[0])swap(y,z);
        System.out.println(x[0]+" "+y[0]+" "+z[0]);
    }
    static void swap(int[] x,int[] y)
    {
        int temp=x[0];
        x[0]=y[0];
        y[0]=temp;
    }
}
