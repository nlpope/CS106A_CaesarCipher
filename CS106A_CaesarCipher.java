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
	private String encryptedMessage = "";
	//PSCipher cipher = new PSCipher();
	
	public void run()
	{
		introduceApp();
		while(true){
			int clientShift = readInt("Enter the number of character positions to shift: ");
			String clientStr = readLine("Enter a message: ");
			encryptedMessage = new PSCipher().encodeCaesarCipher(clientStr, clientShift);
			println("Encoded message: " + encryptedMessage);
			encryptedMessage = "";
		}
	}
	
	
	private void introduceApp()
	{
		println("This program encodes a message using a Caesar cipher.");
	}
}