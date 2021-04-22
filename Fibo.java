import java.util.Scanner;

public class Fibo {
    static int a=0,b=1;
    void fib(int n)
    {
        int t;
     if(n>0)
     {System.out.println(a);
         t = a+b;
         a=b;
         b = t;
         --n;
         fib(n);
     }

    }
    public static void main(String[] args) {
        Scanner ox =new Scanner(System.in);
        Fibo ac =new Fibo();
        ac.fib(ox.nextInt());

    }
}