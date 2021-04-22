public class EorO {
 static int n=2;
 String even_or_odd(int a){
 if(a%2==0)
 return "number is even";
 else
 return "number is odd";
 }
 public static void main(String[] args) {
 EorO xp=new EorO();
 System.out.println(xp.even_or_odd(n));
 }
}