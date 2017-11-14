package Zadaca_18;
import java.util.Scanner;

public class brojSlova {

	public static void main(String[] args) {
		
				Scanner unos = new Scanner(System.in);
				System.out.print("Unesite svoj string:\n");
				String string = unos.nextLine();
				unos.close();
				System.out.println("String \"" + string + "\"je sastavljen od: " + broji(string));
			}

			public static int broji(String s) {
				int brSlova = 0;
				for (int i = 0; i < s.length(); i++) {
					if (Character.isLetter(s.charAt(i)))
						brSlova++;
				}
				return brSlova;
			}}
