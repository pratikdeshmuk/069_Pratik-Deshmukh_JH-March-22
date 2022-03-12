import java.util.Scanner;

class q6
{
  public static void main(String args[])
  { 
     Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter number 1 : ");
	 int n1 = sc.nextInt();
	 System.out.println(" Enter number 2 : ");
	 int n2 = sc.nextInt();
	 
	 System.out.println("Addition = "+(n1+n2));
	 System.out.println("Subtraction = "+(n1-n2));
	 System.out.println("Multiplication = "+(n1*n2));
	 System.out.println("Division = "+(n1/n2));
	 System.out.println("Reminder = "+(n1%n2));
   }
 }