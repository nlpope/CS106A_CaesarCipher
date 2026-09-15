/**
 * File: CS106A_CaesarCipher.java 
 * ------------------------------------------
 * The CS106A_CaesarCipher class encrypts a message
 * by shifting every letter in the String ahead by 
 * a specified amount.
 * 
 */

import acm.program.*;
import com.popesoftware.test.*;

public class CS106A_CaesarCipher extends ConsoleProgram
{
	private static final String SENTINEL = "ENDPROGRAM";
	private String finalEncryptedStr;
	
	public void run()
	{
		introduceApp();
		while(true){
			String clientStr = readLine("enter string: ");
			if (clientStr.equals(SENTINEL)){println("bye now."); break;}
			println(PSCipher.encodeCaesarCipher(clientStr));
		}
	}
	
	
	private void introduceApp()
	{
		println("This program encodes a message using a Caesar cipher.");
		int clientShift = readInt("Enter the number of character positions to shift: ");
		String clientStr = readLine("");
		
		println("Encoded messsage: " + finalEncryptedStr);
	}
}