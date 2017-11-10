package Zadaca_16;
import java.util.Scanner;

public class Naopak_String {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite svoj string ispod\nda ga okrenemo naopako :) ");
		String str = unos.nextLine();
		
	     int duzina = str.length();

	     int index=duzina-1;
    	 System.out.print("I dobijete:\n");

	     while(index>=0){
	        System.out.print(str.charAt(index));
	        index--;
			unos.close();
}}}