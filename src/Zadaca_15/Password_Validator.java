package Zadaca_15;
import java.util.Scanner;

public class Password_Validator {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite svoj password: ");
		String password = unos.nextLine();
		unos.close();
		if (password.length() < 8) {   
        	System.out.println("Password nije validan.");
	    }else{      
	        char c;  
	        int brojac = 0;   
	        for (int i = 0; i < password.length(); i++) {  
	            c = password.charAt(i);  
	            if (!Character.isLetterOrDigit(c)) {          
	            	System.out.println("Password nije validan.");
	            	}else if (Character.isDigit(c)){  
	                brojac++;
	                }}
	        	if (brojac < 2){     
	            	System.out.println("Password nije validan.");
	        }else{
	        	System.out.println("Password je validan.");
}}}}