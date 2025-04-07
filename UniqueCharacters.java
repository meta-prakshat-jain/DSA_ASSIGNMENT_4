package Assignment_4;

import java.util.*;

public class UniqueCharacters {
	    public static void main(String[] args) {
	        String[] testArray = new String[]{"Java", "is", "the", "best", "programming",
	                "language", "in", "the", "world!"};
	        CharCounter charCounter = new CharCounter();
	        Print print = new Print();
	        print.printArgs(testArray);
	        print.print(charCounter.charCounter(testArray));
	    }
	}

	/**
	 *  CharCounter should takes a string and returns the number of unique
	 *  characters in the string.
	 */
	 class CharCounter {
	    public LinkedHashMap<Character, Integer> charCounter(String[] args) {
	        LinkedHashMap<Character, Integer> elements = new LinkedHashMap();
	        List<Character> chars = new ArrayList();
	        for (char c : stringToCharArray(args)) {
	            chars.add(c);
	        }
	        for (Character element : chars) {
	            if (elements.containsKey(element)) {
	                elements.put(element, elements.get(element) + 1);
	            } else {
	                elements.put(element, 1);
	            }
	        }
	        return elements;
	    }

	    /**
	     * stringToCharArray method - convert string array to character array     *
	     */
	    private char[] stringToCharArray(String[] args) {
	        String s = "";
	        for (String agr : args) {
	            if (s == "") {
	                s = agr;
	            } else {
	                s = s + " " + agr;
	            }
	        }
	        return s.toCharArray();
	    }
	}

	/**
	 * The Print class is intended to output the result to the console
	 */
	 class Print {
	    public void print(Map map) {
	        Iterator<Map.Entry<Character, Integer>> iterator
	                = map.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Character, Integer> charCounterEntry = iterator.next();
	            System.out.printf("\"%c\" - %d\n", charCounterEntry.getKey(),
	                    charCounterEntry.getValue());
	        }
	    }

	    public void printArgs(String[] args) {
	        for (String arg : args) {
	            System.out.printf("%s ", arg);
	        }
	        System.out.println();
	    }
	}

