package Zadaca_16;
import java.util.Scanner;

public class Unikatan_1st_Char{
	public static void main(String[] args){
		
		        Scanner unos = new Scanner(System.in);
		        System.out.println("Unesite string: ");
		        String str = unos.nextLine().toUpperCase();
		        unos.close();
		        
		        for(int i = 0; i < str.length(); i++){
		            boolean nope = true;
		            
		            for(int j = 0; j < str.length(); j++){
		                if (i == j)
		                    continue;
		                
		                if(str.charAt(i) == str.charAt(j)){
		                    nope = false;
		                    break; 
		                    }}
		            
		            		if(nope){
		            			System.out.println("=========================");
		            			System.out.println("Prvi unikatni karakter je:\n" + "|-> " + str.charAt(i) + " <-|");
		            			System.out.println("=========================");
		            			break;
}}}}