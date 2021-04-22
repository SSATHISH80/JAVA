import java.util.Scanner;

public class Elect {
    float bill=0;
 Elect(float units)
 {
     if(units <=100)
     {
         System.out.println("Bill Amount is ₹0");
     }
     else if(units>100 && units<=200)
     {
      bill = 50.0f + ((units-100)*.25f);
         System.out.println("Bill Amount is ₹ : "+bill);
     }
     else if(units>200 && units<250)
     {
         bill = 50.0f + (100 .25f)+((units-100).5f);
         System.out.println("Bill Amount is ₹ : "+bill);
     }
     else if(units>250 && units <=350)
     {
         bill = 50.0f + (100*.25f)+ ((150)*.5f) + ((units-250) * .75f);
         System.out.println("Bill Amount is ₹ : "+bill);
     }
     else
     {
         bill = 50.0f + (100*.25f)+ ((150)*.75f) + (100 *1)+((units-350)*3);
         System.out.println("Bill Amount is ₹ : "+bill);
     }
 }
    public static void main(String[] args) {
        Scanner ax=new Scanner(System.in);

        new Elect(ax.nextFloat());

    }
}