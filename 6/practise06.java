/*************************************************************************
	> File Name: practise06.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 03:45:58 PM CST
 ************************************************************************/
public class practise06{

    public static void main(String[] args){
        int m=86;
        int n=43;
        while(n!=0)
        {
            int t=m;
            m=n;
            n=t%n;
        }
        System.out.println(m);
    }

}
