import java.util.Scanner;
public class Armstrong{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
int r=0,sum=0;
int m=n;
while(n!=0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(m==sum)
{
System.out.println("armstrong number");
}
else
{
System.out.println("not a armstrong number");
}
}
}