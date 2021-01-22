package introduction;

import java.util.*;
import java.io.*;

public class JavaLoopsII {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		int[][] tab = new int[t][3];
		
		for(int i=0; i<t;i++) {
			for(int j=0; j<3;j++) {
				tab[i][j] = scn.nextInt();
			}
		}
		
		for(int i=0; i<t;i++) {
			int temp = tab[i][0];
			for(int j=0; j<tab[i][2];j++) {
				temp += Math.pow(2, j) * tab[i][1];
				System.out.print(temp +" ");
			}
			System.out.println();
		}
		
		scn.close();
	}

}
