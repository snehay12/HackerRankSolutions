package hackerSolution;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalSample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		for(int i=0;i<n;i++)
		{
			s[i] = sc.next();
			//System.out.println(numbers[i]);
		}
		sc.close();
		
		Arrays.sort(s, Collections.reverseOrder(
				new Comparator<String>() {
					public int compare(String a, String b) {
						BigDecimal aNum = new BigDecimal(a);
						BigDecimal bNum = new BigDecimal(b);
						return aNum.compareTo(bNum);
						}
				    }));
		
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}
