import java.util.Scanner;

class q7
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter number : ");
	 int n1 = sc.nextInt();
	 int i = 1;
	 
	 while(i<=10)
	 {
	  System.out.println(" " +n1+" * " +i+ " = " +(n1*i));
	  i++;
	 }
   }
}