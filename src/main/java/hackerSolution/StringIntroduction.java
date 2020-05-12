package hackerSolution;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {

		//Take two string input
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		String newA=null;
		String newB=null;
		//Print the sum of length
		System.out.println(A.length() + B.length());
		//Identify if A string > B String
		System.out.println(isLexicographicGreater(A, B) ? "Yes" : "No");
		//Convert first alphabet to capital and rest lower.
		newA= A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
		newB= B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
		System.out.println(newA+" "+newB);
		sc.close();

	}

	private static boolean isLexicographicGreater(String A, String B) {
		if(A.compareTo(B)>0)
			return true;
		else
			return false;
	}

}
