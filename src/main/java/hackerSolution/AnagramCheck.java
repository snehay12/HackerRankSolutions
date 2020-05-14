package hackerSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	static boolean isAnagram(String a, String b) {
        boolean result = true;
        if(a.length()!=b.length())
        	return false;
        
        Map<String,Integer> aMap = new HashMap<String,Integer>();
        Map<String,Integer> bMap = new HashMap<String,Integer>();
        
        String aChar, bChar;
        //Create a map of characters and count
        for(int i=0;i<a.length();i++)
        {
        	aChar=String.valueOf(a.charAt(i)).toLowerCase();
        	bChar=String.valueOf(b.charAt(i)).toLowerCase();
        	if(!aMap.containsKey(aChar))
        		aMap.put(aChar, 1);
        	else
        		aMap.put(aChar, aMap.get(aChar)+1);
        	
        	if(!bMap.containsKey(bChar))
        		bMap.put(bChar, 1);
        	else
        		bMap.put(bChar, bMap.get(bChar)+1);
        }
        
        //Iterate through the map and return false if count doesn't match
        for(Map.Entry<String, Integer> entry: aMap.entrySet())
        {
        	Integer aValue = entry.getValue();
        	Integer bValue = bMap.get(entry.getKey())==null? 0: bMap.get(entry.getKey());
        	if(!aValue.equals(bValue))
        	{
        		result=false;
        		break;
        	}
        }
        return result;
    }
}
