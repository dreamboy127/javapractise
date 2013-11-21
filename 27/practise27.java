/*************************************************************************
	> File Name: practise27.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 09:54:45 PM CST
 ************************************************************************/
public class practise27{
    public static void main(String[] args){
        for(int i=2;i<=100;i++)
        {
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++)
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            if(flag==true)
                System.out.println(i);
        }
    }
}
