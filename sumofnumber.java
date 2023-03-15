import java.util.Scanner;
class displayNumber
 {
  public static void main(String args[])
   {
    int r,num,sum=0;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number:");
    num=input.nextInt();
    while(num!=0)
     {
      r=num%10;
      sum=sum+r;
      num=num/10;
     }
    System.out.println("The sum of numbers is:"+sum);
   }
 }

