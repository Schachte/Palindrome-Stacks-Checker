import java.util.*;
/*
 * Ryan Schachte
 * Stack implementation
 * Build a program to continuously accept stacks until user enters "end"
 * Stores stack forward order and stack reverse order into two seperate string and determines if word is a palindrome
 */

public class PalindromeStacks {
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Stack<String> stackInformation = new Stack<String>();
		String forward  = "";
		String reversed = "";
		boolean isPalindrome = false;
		
		System.out.println("Enter a word with a new character on each line: \n\nEnter \"end\" to finalize the word!");
		
		String stackAdd = input.nextLine();
		
		while (!stackAdd.equalsIgnoreCase("end"))
		{
			stackInformation.push(stackAdd);
			
			stackAdd = input.nextLine();

		}
		
		Iterator<String> iter = stackInformation.iterator();
		
		System.out.print("Your word is: ");
		while(iter.hasNext())
		{
			forward += iter.next();
		}
		System.out.print(forward);
		
		System.out.println("");
		
		System.out.print("Your reversed word is: ");
		while(!stackInformation.isEmpty())
		{
			reversed+=stackInformation.peek();
			stackInformation.pop();
		}
		
		System.out.print(reversed);
		
		System.out.println("");

		if (forward.equalsIgnoreCase(reversed))
			isPalindrome = true;
			
		else
			isPalindrome = false;
		
		if (isPalindrome)
			System.out.println("This is a palindrome!");
			
		else if(!isPalindrome)
			System.out.println("This is not a palindrome..");
	}

}
