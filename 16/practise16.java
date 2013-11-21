/*************************************************************************
	> File Name: practise16.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 08:26:02 PM CST
 ************************************************************************/
public class practise16{
    public static void main(String[] args){
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(i+"*"+j+"="+(i*j)+"  ");
            System.out.println();
        }
    }
}
