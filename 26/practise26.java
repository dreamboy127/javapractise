/*************************************************************************
	> File Name: practise26.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 09:33:25 PM CST
 ************************************************************************/
import java.util.Scanner;
public class practise26{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char first=scan.next().charAt(0);
        String str=null;
        switch(first)
        {
            case 'm':str=new String("Monday");break;
            case 't':
                    char second=scan.next().charAt(0);
                    if(second=='u')
                       str=new String("Tuesday");
                    if(second=='h')
                       str=new String("Thursday");
                    break;
            case 'w':str=new String("Wendnesday");break;
            case 'f':str=new String("Friday");break;
            case 's':
                    second=scan.next().charAt(0);
                    if(second=='u')
                       str=new String("Sunday");
                    if(second=='h')
                       str=new String("Saterday");
                    break;
        }
        System.out.println(str);
    }
}
