import java.util.Scanner;

class quadratic
{
    public static void main (String args[])
    {
        int a,b,c,d,r1,r2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        a=in.nextInt();

        System.out.println("Enter the value of b:");
        b=in.nextInt();

        System.out.println("Enter the value of c:");
        c=in.nextInt();

        d=(b*b)-(4*a*c);

        if (a==0)
        {
            System.out.println("Not a quadratic equation");
        }
        if (d==0)
        {
            r1=(-b)/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("Root is:" +r1);
        }
        else if (d>0)
        {
            r1 = ((-b) + (int) Math.pow(d, 1/2))/(2*a);
            r2 = ((-b) + (int) Math.pow(d, 1/2))/(2*a);
            System.out.println("Roots are real and distinct");
            System.out.println("Roosts are:" +r1+ "and" +r2);
        }
        else if (d<0)
        {
            System.out.println("Roots are imaginary");
            r1 = (-b)/(2*a);
            r2 = (int)Math.sqrt(-d)/(2*a);
            System.out.println("Roots are:" +r1+ "and" +r2);
        }
        else
        {
            System.out.println("Invalid Number");
        }


      


    }
}
