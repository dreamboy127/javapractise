/*************************************************************************
	> File Name: practise11.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 03:41:03 PM CST
 ************************************************************************/
public class practise11{
    public static void main(String[] args)
    {
        int count=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(j==i)
                    continue;
                for(int k=1;k<=4;k++)
                {
                    if(k==j||k==i)
                        continue;
                    count++;
                    System.out.println("the"+count+":"+(i*100+j*10+k));
                }
            }
        }       
    }
}
