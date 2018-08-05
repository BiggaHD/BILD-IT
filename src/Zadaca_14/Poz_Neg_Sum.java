package Zadaca_14;
import java.util.Scanner;

public class Poz_Neg_Sum {

	public static void main(String[] args) {

			Scanner unos=new Scanner(System.in);
			
			System.out.println("Unesi niz cijelih brojeva (0 prekida unos): ");
			int broj=unos.nextInt();
			int P=0,N=0,suma=0;
			double avg=0;
			while(broj!=0){
				suma=suma+broj;
				if (broj>0){
					P++;}
				if (broj<0){
					N++;}				
				avg=(double)suma / (P + N);
				broj=(int) unos.nextDouble();}
			System.out.println("Broj pozitivnih:\n" + P + "\nBroj negativnih:\n" + N);
			System.out.println("Suma svih brojeva:\n" + suma);
			System.out.printf("Njihov prosjek je %.2f", avg);
				unos.close();
}}
