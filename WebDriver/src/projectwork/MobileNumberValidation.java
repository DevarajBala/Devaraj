package projectwork;

import java.util.Scanner;
import java.util.regex.*; 	

	public class MobileNumberValidation  {   
		
	public static boolean isValidMobileNo(String str)  
	{  
	Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
	//the matcher() method creates a matcher that will match the given input against this pattern  
	Matcher match = ptrn.matcher(str);  
	//returns a boolean value  
	return (match.find() && match.group().equals(str));  
	}  
	
	public static void main(String args[]) 
	{     
	Scanner sc = new Scanner (System.in);
	String mnum = sc.nextLine();  
	
	if (isValidMobileNo(mnum))  
	System.out.println("It is a valid mobile number.");   
	else  
	System.out.println("Entered mobile number is invalid.");      
	}  
	} 
	

