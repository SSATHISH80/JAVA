import java.util.Scanner;

interface series{
    int fact(int x);
    void fibo(int n);
}
public class fact_fibo implements series {
 static int a=0,b=1;
    public int fact(int x) {
        if(x==0)
            return 1;
        else
            return x*fact(x-1);
    }



    public void fibo(int n) {
        int t;
        if(n>0)
        {System.out.println(a);
            t = a+b;
            a=b;
            b = t;
            --n;
            fibo(n);
        }
    }

    public static void main(String[] args) {
        Scanner ax= new Scanner(System.in);
        fact_fibo o =new fact_fibo();
        System.out.println("Factorial value "+o.fact(ax.nextInt()));
        o.fibo(ax.nextInt());
    }
}