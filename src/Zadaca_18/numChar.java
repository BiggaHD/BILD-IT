package Zadaca_18;
import java.util.Scanner;

public class numChar {

		public static void main(String[] args) {
			Scanner unos = new Scanner(System.in);
			System.out.print("Unesi string u formatu |rijec, karakter|:\n(npr ==>> Dobrodosli, o)\n");
			String string = unos.nextLine();
			unos.close();
			int k = string.indexOf(", ");
			String str = string.substring(0, k);
			char ch = string.charAt(k + 2);
			System.out.println("Broj pojavljivanja \"" +  ch + "\" u \""  + str  + "\" je: " + brojac(str, ch));
		}

		/** METODA ZA BROJANJE POJAVLJIVANJA */
		public static int brojac(String str, char a) {
			int start = 0;
			for (int i = 0; i < str.length(); i++) {
				if (a == str.charAt(i))
					start++;
			}
			return start;
		}}
