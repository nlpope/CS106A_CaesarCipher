//PSCipher
package com.popesoftware.test;
import java.util.*;

public class PSCipher
{
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	//private static String originalMessage;
	private static String encryptedMessage = "";
	
	public static String encodeCaesarCipher(String str, int shift)
	{
		StringTokenizer tokenizedStr = new StringTokenizer(str, DELIMITERS, true);
		while (tokenizedStr.hasMoreTokens()){
			String token = tokenizedStr.nextToken();
			checkAndReplace(token, shift);
		}
		return encryptedMessage;
	}
	
	
	private static void checkAndReplace(String token, int shift)
	{
		for (int i = 0; i < token.length(); i++){
			boolean firstCase = (token.charAt(i) > 64 && token.charAt(i) < 91);
			boolean secondCase = (token.charAt(i) > 96 && token.charAt(i) < 123);
			if (firstCase){
				int lowerLimit = 65;
				int upperLimit = 90;
				
				
				//where is my shift 4 here for X? 
				//shift would equal charAt value that spills over 90
				//so if charAt's int value + shift ... > 90
				//make encryptedmsg(i) = value jump back to 65 then account for remaining shift points
				//so while shift is not zero, increment from char value up til spills over z 
				if (token.charAt(i) + shift > upperLimit){
					
				}
				//handle negatives later
				for (int j = 0; j <= shift; j++){
					if (token.charAt(i) + j >= upperLimit){ //back to 65 } 
				}
				encryptedMessage += token.charAt(i) + respectiveShift;
			} else if (secondCase){
				
			} else { 
				encryptedMessage += token.charAt(i);
			}
		}
	}
	
	/***
	private static boolean checkClientInputValidityFor(String word)
	{
		if (word.length() == 0) { return false; } 
		for (int i = 0; i < word.length(); i++){
			boolean firstCase = word.charAt(i) < 65 || word.charAt(i) > 90;
			boolean secondCase = word.charAt(i) < 97 || word.charAt(i) > 122;
			if (firstCase && secondCase){ return false; }
		}
		return true;
	}
	*/
}