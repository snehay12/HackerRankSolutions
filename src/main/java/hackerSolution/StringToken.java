package hackerSolution;

import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        //String input = scan.nextLine();
		String input="";
		//String[] tokens = input.toLowerCase().split("[\\s@&.?$,'\\t!;:#%+-><=]+");
		String[] tokens = input.trim().toLowerCase().split("[^a-z0-9]+");
		scan.close();
		if(tokens.length==0||tokens.length==1 && tokens[0].isEmpty())
            System.out.println("0");
        else
            System.out.println(tokens.length);
		for(int i=0;i<tokens.length; i++)
			System.out.println(tokens[i]);
	}

}
