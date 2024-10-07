import java.util.Scanner;
public class FibonacciSeries
{
public static void main(String [] args)
{
  Scanner scanner=new Scanner(System.in);

  
 System.out.println("Enter the term upto which you want the series");
int n=scanner.nextInt();

int firstVar=0,secondVar=1;
for(int i=1;i<=n;i++)
{
    System.out.print(firstVar+" ");
    int nextVar=firstVar+secondVar;
    
    firstVar=secondVar;
    secondVar=nextVar;
}

}
}