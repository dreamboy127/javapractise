/*************************************************************************
	> File Name: practise13.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 04:35:49 PM CST
 ************************************************************************/
public class practise13{
    public static void main(String[] args){
        for(int a=0;a<168;a++)
            for(int b=0;b<168;b++)
                if(b*b-a*a==168)
                    System.out.println(a*a-100);
    }
}
