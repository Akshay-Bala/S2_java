import java.util.Scanner;
class displayRev
{
 public static void main(String args[])
  {
   int num,rev=0,mod;
   Scanner input=new Scanner(System.in);
   System.out.println("Enter the number:");
   num=input.nextInt();
   while(num!=0)
    {
     mod=num%10;
     rev=rev*10+mod;
     num=num/10;
    }
   System.out.println(rev);
  }
}

