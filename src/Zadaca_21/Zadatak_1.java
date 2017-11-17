package Zadaca_21;
import java.util.Scanner;

public class Zadatak_1{

		public static void main(String[] args) {
			Scanner unos = new Scanner(System.in);
			System.out.print("Unesi broj i sirinu za kalkulaciju: ");
			int br = unos.nextInt();
			int width = unos.nextInt();
			unos.close();
			System.out.println(br + " formatirano u sirinu od " + width + " iznosi: " + format(br, width));
		}

		public static String format(int br, int sirina) {
			String num = br + "";
			if (num.length() < sirina) {
				for (int i = sirina - num.length(); i > 0; i--) {
					num = 0 + num;
				}}
			return num;
}}
