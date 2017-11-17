package Zadaca_21;
import java.util.Scanner;

public class Zadatak_5{

//obim kvadrata - O = 4 x a - gdje je a stranica kvadrata
//površina kvadrata - P = a x a - gdje je a stranica kvadrata
	
	public static void main(String[] args){
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite \'a\' vrijednost:");
			double data = unos.nextDouble();
			System.out.println("Povrsina -->> " + (double)Math.round(P(data) * 1000d) / 10000d + " . Povrsina -->> " + O(data));
			unos.close();
		}
		public static double O(double a){
			double O = 4 * a;
			return O;
		}
		public static double P(double a){
			double P = (a * a);
			return P;
		}}
		