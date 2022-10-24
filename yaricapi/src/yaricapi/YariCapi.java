package yaricapi;

import java.util.Scanner;

public class YariCapi {
	
	public static void main(String[] args) {
	
	double pi=3.14;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("dairenin yaricapi girin:");
	int r=sc.nextInt();
	double b;
	b=(pi*r)*r;
	System.out.println("dairenin alani"+b);
	}
	
	
}