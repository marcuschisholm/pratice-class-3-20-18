package movie;
import java.util.Scanner;

public class multiTable {
	public static void main(String[]args){
Scanner scan =new Scanner(System.in);

System.out.println("enter a number");
int n=scan.nextInt();

System.out.println("Multiplication table of "+n+" is :-");

for ( int c = 1 ; c <= 10 ; c++ )
   System.out.println(n+"*"+c+" = "+(n*c));
}
}
