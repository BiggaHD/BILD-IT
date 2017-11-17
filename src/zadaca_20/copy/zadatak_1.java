package zadaca_20.copy;

import java.util.Scanner;

public class zadatak_1{
	public static void main(String[] args){
		
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesi 3 broja:\n");
		double br1 = unos.nextDouble();
		double br2 = unos.nextDouble();
		double br3 = unos.nextDouble();
		unos.close();
		sortiraniBrojevi(br1, br2, br3);
	}

	public static void sortiraniBrojevi(
		double broj1, double broj2, double broj3) {
		double temp;
		
		if (broj2 < broj1 && broj2 < broj3){
			temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}
		else if (broj3 < broj1 && broj3 < broj2) {
			temp = broj1; 
			broj1 = broj3;
			broj3 = temp;
		}
		if (broj3 < broj2) {
			temp = broj2;
			broj2 = broj3;
			broj3 = temp;
		}
		System.out.println("Uneseni brojevi nakon sortiranja: ");

		System.out.println(broj1 + "\n" + broj2 + "\n" + broj3);
	}}
