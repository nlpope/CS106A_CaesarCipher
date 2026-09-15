//PSCipher
package com.popesoftware.test;
import java.util.*;

public class PSCipher
{
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	
	
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
			boolean upperCase = (tokenChar > 64 && token.charAt(i) < 91);
			boolean lowerCase = (tokenChar > 96 && token.charAt(i) < 123);
			
			if (!upperCase && !lowerCase){ encryptedMessage += tokenChar; return; }
			
			lowerLimit = upperCase ? (char) 65 : 97;
			upperLimit = lowerCase ? (char) 90 : 122;
			char shiftedChar = (char) (tokenChar + shift);
			
			if (shiftedChar > upperLimit || shiftedChar < lowerLimit){ 
				handleSpillOverFor(tokenChar, shift); 
			} else {
				encryptedMessage += shiftedChar;
			}
		}
	}
	
	
	private static void handleSpillOverFor(char tokenChar, int shift)
	{
		if (shift < 0){ handleNegativeSpillFor(tokenChar, shift); }
		else { handlePositiveSpillFor(tokenChar, shift); }
	}
		
	
	private static void handlePositiveSpillFor(char tokenChar, int shift)
	{
		char encryptedChar = tokenChar;
		while (shift != 0){
			if (encryptedChar + 1 > upperLimit){ encryptedChar = lowerLimit; } 
			else { encryptedChar++; }
			shift--;
		}
		
		encryptedMessage += encryptedChar;
	}
	
	
	private static void handleNegativeSpillFor(char tokenChar, int shift)
	{
		char encryptedChar = tokenChar;
		while (shift != 0){
			if (encryptedChar - 1 < lowerLimit){ encryptedChar = upperLimit; } 
			else { encryptedChar--; }
			shift++;
		}
		
		encryptedMessage += encryptedChar;
	}
	
	private static String encryptedMessage = "";
	private static char upperLimit;
	private static char lowerLimit;

}
	
	