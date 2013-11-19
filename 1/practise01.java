public class practise01{
    public static void main(String[] Args){
        final int M=24;
        int f1=1;
        int f2=1;
        int f;
        for(int i=3;i<M;i++)
        {
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println(i+"th:"+f2);
        }
    }
}
