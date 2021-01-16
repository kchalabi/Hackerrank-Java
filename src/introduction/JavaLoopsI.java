package introduction;

import java.util.*;

public class JavaLoopsI {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N;
		N = scn.nextInt();
		if (!(N >= 2) || !(N <= 20)){
			System.out.println("N must be between 2 and 20.");
		}
		else
		{
			for (int i = 1 ; i <= 10 ; i++) {
				System.out.println(N+" x "+i+" = "+N*i);
			}
		}
		scn.close();
	}

}