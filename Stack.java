import java.util.Scanner;
public class Stack {
 static int top=-1;int []stackarray=new int[10];
 void push()
 { int value;
 Scanner ax=new Scanner(System.in);
 if(top==9)
 System.out.println("Stack Overflow");
 else
 {
 System.out.println("Enter the value");
 value=ax.nextInt();
 stackarray[++top]=value; 
 }
 }
 void pop()
 { if (top==-1)
 System.out.println("Stack Underflow");
 else
 {
 System.out.println("The popped number is "+stackarray[top]);
 --top;
 }
 }
 void display() {
 int i;
 if (top==-1)
 System.out.println("Stack is empty\n");
 else {
 System.out.println("Stack members are:\n");
 for (i=top;i>=0;i--)
 System.out.println(stackarray[i]);
 }
 }
 public static void main( String[] args) {
 Scanner ax=new Scanner(System.in);
 Stack st=new Stack();
 System.out.println();
 int c; char ch='y';
 do
 { System.out.println("1.Push 2.Pop 3.Display");
 System.out.println("Enter your choice : ");
 c=ax.nextInt();
 switch(c)
 {
 case 1 :
 st.push();
break;
 case 2:
 st.pop();
break; case 3:
 st.display();
break;
 }
 System.out.println("\nDo you want to continue (y/n)");
 ch=ax.next().charAt(0);
 } while(ch=='y'||ch=='Y');
 }
}
