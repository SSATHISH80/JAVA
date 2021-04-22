public class SI_CI {
 float interest(float p,float n,float r)
 {
 return (p*n*r)/100.0f; //simple interest
 }
 double interest(double p, double n,double r, double t)
 {
 return (p*Math.pow((1+(r/100)),n*t)); // compound interest
 }
 public static void main(String[] args) {
 SI_CI a=new SI_CI();
 float s=a.interest(5000,5,5);
 double c=a.interest(5000,5,5,1);
 System.out.println("simple interest = "+s);
 System.out.println("compound interest = "+(c-5000));
 }
}