import java.util.Scanner;
public class ExponentialModularCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int b,e,d,k;
		System.out.print("B >> ");
		b = input.nextInt();
		System.out.print("E >> ");
		e = input.nextInt();
		System.out.print("D >> ");
		d = input.nextInt();
		k = 1;
		int x = 0;
		do
		{	
			k = (k*b) % d;
			++x;
			System.out.println(x+ ". " + k);
		} while(x<e);
	
	}
}