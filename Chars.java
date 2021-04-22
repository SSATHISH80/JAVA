import java.util.Scanner;
public class Chars {
 int A=0,C=0,D=0,i=0;
 Chars(char[] ch)
 {for(i=0;i<ch.length;i++){
 if(Character.isDigit(ch[i]))
 {D++;}
 else if(Character.isAlphabetic(ch[i]))
 { A++; }
 else {
 C++;
 }
 }
 }
 public static void main(String[] args) {
 String a;
 Scanner c =new Scanner(System.in);
 a=c.nextLine();
 char b[]=a.toCharArray();
 Chars s=new Chars(b);
 System.out.println("no of digits = "+s.D);
 System.out.println("no of alphabets = "+s.A);
 System.out.println("no of special characters = "+s.C);
 }
}