package Introduction;

import java.util.*;

public class JavaStdinandStdout {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		scn.close();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
