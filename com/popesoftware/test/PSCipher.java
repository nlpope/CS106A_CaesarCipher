//PSCipher
package com.popesoftware.test;
import java.util.*;

public class PSCipher
{
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	//private static String originalMessage;
	private static String encryptedMessage = "";
	private static char upperLimit;
	private static char lowerLimit;
	
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
			char tokenChar = token.charAt(i);
			boolean firstCase = (tokenChar > 64 && token.charAt(i) < 91);
			boolean secondCase = (tokenChar > 96 && token.charAt(i) < 123);
			
			if (firstCase){ lowerLimit = 65; upperLimit = 90; } 
			if (secondCase){ lowerLimit = 97; upperLimit = 122; }  
			if (tokenChar + shift > upperLimit){ handlePositiveShift(shift, tokenChar); }
			else if (tokenChar + shift < lowerLimit){ handleNegativeShift(shift, tokenChar); } 
			else { encryptedChar = tokenChar + shift; }
				if (token.charAt(i) + shift > upperLimit) { handlePositiveShift(); }
				else if (token.charAt(i) + shift < lowerLimit){ handleNegativeShift(); }
				
				
				encryptedMessage += encryptedChar;
			} else if (secondCase){
				
			} else { 
				encryptedMessage += token.charAt(i);
			}
		}
	}
	
	
	private static void handlePositiveShift(int shift, char tokenChar)
	{
		char encryptedChar = tokenChar;
		for (int i = 0; i <= shift; i++){
			if (encryptedChar + i > upperLimit){ 
				encryptedChar = lowerLimit; 
			} 
			encryptedChar++;
		}
	}
	
	
	private static void handleNegativeShift(int shift, char tokenChar)
	{
		
	}
}