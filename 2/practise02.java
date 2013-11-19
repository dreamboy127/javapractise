/*************************************************************************
	> File Name: practise02.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 03:08:42 PM CST
 ************************************************************************/
public class practise02{
    public static void main(String[] args){
        int count=0;
        for(int i=101;i<=200;i++)
        {
            boolean flag=false;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)
                continue;
            count++;
            System.out.println("the "+count+"th:"+i);
        }
    }
}
