import java.util.Scanner;
public class Nprime {
 static void printPrimeNos(int N){
 int num = 2;
 int p = 0;
 while(p< N){
 if(isPrime(num)){
 System.out.print(num + " ");
 p++;
 }
 num++;
 }
 }
 static boolean isPrime(int n){
 for (int i = 2; i <=n/2 ; i++) {
 if(n%i==0)
 return false;
 }
 return true;
 }
 public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 printPrimeNos(s.nextInt());
 System.out.println();
 }
}