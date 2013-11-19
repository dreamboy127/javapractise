/*************************************************************************
	> File Name: practise04.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Tue 19 Nov 2013 03:20:27 PM CST
 ************************************************************************/
public class practise04{
    public static void main(String[] args){
        int k=2;
        int n=90;
        boolean flag=true;
        while(k<n){
            if(n%k==0)
            {
                if(flag==true){
                    System.out.print(n+"="+k);
                    flag=false;
                }
                else if(flag==false)
                    System.out.print("*"+k);
                n=n/k;
                k=2;
            }
            else
                k++;
        }
        System.out.println("*"+k);
    }
}
