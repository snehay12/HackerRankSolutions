package hackerSolution;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        boolean isPalindrome=true;
	        for(int i=0, j=A.length()-1;i<A.length()/2;i++,j--)
	        {
	        	if(!String.valueOf(A.charAt(i)).equalsIgnoreCase(String.valueOf(A.charAt(j))))
	        	{
	        		isPalindrome=false;
	        		break;
	        	}
	        }
	        System.out.println(isPalindrome? "Yes":"No");
	}

}
