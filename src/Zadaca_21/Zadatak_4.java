package Zadaca_21;
import java.util.Scanner;

public class Zadatak_4{

	public static void main(String[] args){
		coinFlip();
	}
	
		public static boolean coinFlip(){
			Scanner unos = new Scanner(System.in);
			System.out.println("Koliko puta zelis bacati novcic?");
			int izbor = unos.nextInt();
			unos.close();
			int pismo=0, glava=0;
			for (int i=0; i<izbor; i++) {
	            int flip = (int) (Math.random() * 2);
	            if (flip == 1) {
	                glava++;
	            }else{
	                pismo++;
	        }}
	        System.out.println("Heads: " + glava + " Tails: " + pismo);
				return true;
	    }}
