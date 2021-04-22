import java.util.Scanner;
public class MatMul {
static int r1,c1,r2,c2,i=0,j=0,k=0;
 MatMul(int[][] a, int[][] b,int[][] c)
 { i=j=0;
 while(i<r1)
 {
 if (j < c2)
 {
 for(k=0;k<c1;++k)
 {
 c[i][j] += a[i][k]*b[k][j];
 }
 ++j;
 }
 else {
 j = 0;
 ++i;
 System.out.println();
 }
 }i=j=0;
 while(i<r1)
 {
 if(j<c2)
 { System.out.print(c[i][j] +" ");
 j++;
 }
 else{
 j=0;
 i++;
 System.out.println();
 }
 }
 }
 public static void main(String[] args) {
 Scanner S=new Scanner(System.in);
 System.out.println("enter first matrix size");
 r1=S.nextInt();
 c1= S.nextInt();
 System.out.println("enter second matrix size");
 r2= S.nextInt();
 c2= S.nextInt();
 int[][] a =new int[r1][c1];
 int[][]b=new int[r2][c2];
 int [][]c=new int[r1][c2];
 System.out.println("enter first matrix elements");
 while(i<r1)
 {
 if(j<c1)
 {
 a[i][j]=S.nextInt();
 j++;
 }
 else{
 j=0;
 i++;
 }
 }
 i=j=0;
 System.out.println("enter second matrix elements");
 while(i<r2)
 {
 if(j<c2)
 {
 b[i][j]=S.nextInt();
 j++;
 }
 else{
 j=0;
 i++;
 }
 }
 new MatMul(a,b,c);
 }
}
