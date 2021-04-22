import java.util.Scanner;

interface shapes
{
    void rectangle(int l,int b);
    void triangle(float H ,float B);
    void circle(float r);
}
public class Areas implements shapes{


    public void rectangle(int l, int b) {
        System.out.println("area of rectangle = "+(l*b));

    }


    public void triangle(float H, float B) {
        System.out.println("area of triangle = "+(H*B) *.5f);
    }


    public void circle(float r) {
        System.out.println("area of circle = "+(2*r*r*3.14));
    }
}
class sum extends Areas{
    public static void main(String[] args) {
        sum ax =new sum();
        Scanner o=new Scanner(System.in);
        ax.circle(o.nextFloat());
        ax.rectangle(o.nextInt(),o.nextInt());
        ax.triangle(o.nextFloat(),o.nextFloat());
    }
}