/*************************************************************************
	> File Name: practise09.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Wed 20 Nov 2013 11:22:39 AM CST
 ************************************************************************/
public class practise09{
    public static void main(String[] args){
        for(int i=1;i<1000;i++)
        {
            int temp=i;
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)temp-=j;
            }
            if(temp==0)
                System.out.println(i);
        }
    }
}
