import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class UserInterface {
	public static boolean validName(String name) {
		return name.matches("[a-zA-Z ]+");
	}
	
	public static Map<Character, Integer> getCharFrequency(String name){
		Map<Character, Integer> map = new HashMap<>();
		name = name.toLowerCase().replaceAll("\\s+", "");
		for(char ch : name.toCharArray()) {
			 map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		return map;
	}
	
	public static int caculateValue(Map<Character, Integer> map1, Map<Character, Integer> map2) {
		int changes = 0;
		
		for (char ch : map1.keySet()) {
	        int count1 = map1.getOrDefault(ch, 0);
	        int count2 = map2.getOrDefault(ch, 0);
	        changes += Math.abs(count1 - count2);
	    }

	    for (char ch : map2.keySet()) {
	        if (!map1.containsKey(ch)) {
	            changes += map2.get(ch);
	        }
	    }
	    
	    System.out.println("Man Frequency: " + map1);
	    System.out.println("Woman Frequency: " + map2);
	    System.out.println("Total Changes: " + changes);

	    return changes;
	}
	
//	public static String sortString(String str) {
//		char[] charArray = str.toCharArray();
//		Arrays.sort(charArray);
//		return new String(charArray);
//	}
	
	public static boolean isSubSequence(String manName, String womanName) {
		manName = manName.toLowerCase().replaceAll("\\s+", "");
		womanName = womanName.toLowerCase().replaceAll("\\s+", "");
		
//		manName = sortString(manName);
//		womanName = sortString(womanName);
		
		int i = 0, j = 0;
		while(i < manName.length() && j < womanName.length()) {
			if(manName.charAt(i) == womanName.charAt(j)) {
				i++;
			}
			j++;
		}
		
		return i == manName.length();
		
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the man name");
        String manName = sc.nextLine();
        
        System.out.println("Enter the woman name");
        String womanName = sc.nextLine();
        
        if(!validName(manName) && !validName(womanName)) {
        	System.out.println("Both " + manName + " and " + womanName + " are invalid names");
        	return;
        }
        else if(!validName(womanName)) {
        	System.out.println(womanName + " is an invalid name");
        	return;
        }
        else if(!validName(manName)) {
        	System.out.println(manName + " is an invalid name");
        	return;
        }
        
        if (manName.equals(womanName) || isSubSequence(manName, womanName) || isSubSequence(womanName, manName)) {
            System.out.println(manName + " and " + womanName + " are made for each other");

            Map<Character, Integer> manFreq = getCharFrequency(manName);
            Map<Character, Integer> womanFreq = getCharFrequency(womanName);

            int compatibilityValue = caculateValue(manFreq, womanFreq);

            System.out.println("Compatibility Value is " + compatibilityValue);
        } else {
            System.out.println(manName + " and " + womanName + " are not made for each other");
        }
        
    }
}

