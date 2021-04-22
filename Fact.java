public class Fact{
int fact(int x)
{
 if(x==0)
 return 1;
 else
 return x*fact(x-1);
}
 public static void main(String[] args) {
 Fact op=new Fact();
 System.out.println("5 factorial is = "+op.fact(5));
 }
}