package Assignment_4;

import java.util.HashMap;

public class CountUniqueChar {
	
	static int uniqueCharacter (String str, HashMap<String, Integer> uniqueString) {
		HashMap<Character, Integer> uniqueCharHashMap=new HashMap<>(); 
		if(!uniqueString.containsKey(str)) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			uniqueCharHashMap.put(ch, 1);
		}
		uniqueString.put(str, uniqueCharHashMap.size());
		}
//		System.out.println(uniqueCharHashMap);
		return uniqueString.size();
	}
	public static void main(String[] args) {
		HashMap<String, Integer> uniqueString=new HashMap<>();
		System.out.println(uniqueCharacter("World",uniqueString));
		System.out.println(uniqueCharacter("Hello",uniqueString));
		System.out.println(uniqueCharacter("World",uniqueString));
		
		System.out.println(uniqueString);
		
	}

}
