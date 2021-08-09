import java.util.Scanner;
import static java.lang.Math.pow;

public class interest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Principal: ");
		double principal=sc.nextDouble();
		System.out.println("Rate: ");
		double rate = sc.nextDouble();
		System.out.println("Time: ");
		double time = sc.nextDouble();
		double simpleinterest = simple (principal,rate,time);
		double compoundinterest = compound(principal,rate,time);
		System.out.println("Simple Interest: "+simpleinterest);
		System.out.println("Compound Interest: "+compoundinterest);
		sc.close();
	}
	
	static double simple(double p, double r, double t )
	{
		double si = (p*r*t)/100;
		return si;
	}
	static double compound(double p, double r, double t )
	{
		r = (1+r/100);
		r = pow(r,t);
		double amt = p * r;
		double ci = amt-p;
		return ci;
	}

}
