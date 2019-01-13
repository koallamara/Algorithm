package coci_1617_1;

import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int n = in.nextInt();
		
		x = x * (n+1);
		
		while(n-- > 0)
			x -= in.nextInt();
		
		System.out.println(x);
		
		/* ver 1.0
		int[] pi = new int[n];
		int p = 0;
		
		for(int i=0; i<n; i++) {
			pi[i] = in.nextInt();
			p += (x - pi[i]);
		}
		
		System.out.println(p + x);
		*/
	}

}
