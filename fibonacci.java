public class fibonacci
{
    static void calFibonacci(int n)
    {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 1;i < n-1;i++)
        {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }
    public static void main(String[] args)
    {
        int n = 10;
        calFibonacci(n);
    }
}
