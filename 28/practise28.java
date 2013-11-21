/*************************************************************************
	> File Name: practise28.java
	> Author: jerrychou
	> Mail: jerrychou127@gmail.com 
	> Created Time: Thu 21 Nov 2013 09:58:42 PM CST
 ************************************************************************/
public class practise28{
    public static void main(String[] args){
        int data[]={7,4,9,2,6,5,1,8,3};
        Qsort(data,0,8);
        for(int i=0;i<9;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    static void Qsort(int[] data,int start,int end)
    {
        if(start<end)
        {
            int index=partition(data,start,end);
            Qsort(data,start,index-1);
            Qsort(data,index+1,end);
        }
    }
    static int partition(int[] data,int start,int end)
    {
        int index=data[start];
        while(start<end)
        {
            while(start<end&&data[end]>index)end--;
            int temp=data[end];
            data[end]=data[start];
            data[start]=temp;
            while(start<end&&data[start]<index)start++;
            temp=data[end];
            data[end]=data[start];
            data[start]=temp;
        }
        return index;
    }
}
