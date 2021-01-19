/*
 * Name: Christopher Grigsby 
 * Date: 10/21/20
 * Assignment: Lab21(MoveElements)
 */

/**
 * Program Description: 
 * Provides a method that modifies an ArrayList<String>, 
 * moving all strings starting with an uppercase letter to the front, 
 * without otherwise changing the order of the elements.
 */

import java.util.*; 

public class MoveElement 
{
	public static void main(String[] args) 
	{
		//Initialize all variables
		Scanner in = new Scanner(System.in); 
		
		ArrayList <String> words = new ArrayList<>(); 
		
		words.add("a"); 
		words.add("Drop"); 
		words.add("in"); 
		words.add("Time"); 
		words.add("adds"); 
		words.add("Nine"); 
		words.add("to"); 
		words.add("the"); 
		words.add("Line"); 
		words.add("Say"); 
		words.add("what?"); 
		
		//Display 
		System.out.println("Before shifting words: "+ words); 
		System.out.println("\nAfter shifting words:  "+ shiftUppercase(words)); 
		
	}//main 
	
	
	/**
	 * Method shiftUppercase - modifies a String ArrayList moving all strings 
	 * starting with an upper case letter to the front, maintaining order for the rest of the string
	 * @param words - a string ArrayList 
	 * @return - a modified ArrayList with all String starting with an upper case letter to the front 
	 */
	
	public static ArrayList<String> shiftUppercase(ArrayList<String> words)
	{
		ArrayList<String> newWords = new ArrayList<>(); 
		char ch; 
		String temp = ""; 
		int i = 0; 
		
		
		while ( i < words.size() )
		{
			temp = words.get(i); 
			ch = temp.charAt(0);  
			
			if (Character.isLowerCase(ch))
			{
				words.remove(temp);
				newWords.add(temp); 
			}
			else
			{
				i++; 
			}
		}
		for (String j : newWords)
		{
			words.add(j); 
		} 
		return words; 
		
	}//shiftUppercase
	
}//class
