import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input= new Scanner(System.in);
        System.out.print("A GİR: ");
         a= input.nextInt();
         System.out.print("B GİR: ");
         b= input.nextInt();
         c=Math.sqrt((a*a)+(b*b));
         System.out.println("***************************");

         System.out.println("Hipotenüs: "+ c);



    }
}
