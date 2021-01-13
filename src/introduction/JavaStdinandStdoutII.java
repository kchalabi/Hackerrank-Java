package introduction;

import java.util.*;

public class JavaStdinandStdoutII {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		double b = scn.nextDouble();
		scn.nextLine();
		String c = scn.nextLine();
		scn.close();
		System.out.println("String: " + c);
		System.out.println("Double: " + b);
		System.out.println("Int: " + a);
	}

}
