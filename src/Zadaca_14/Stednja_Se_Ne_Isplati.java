package Zadaca_14;
import java.util.Scanner;

public class Stednja_Se_Ne_Isplati{
	    public static void main(String[] args) {
	        Scanner unos = new Scanner(System.in);
	        System.out.print("Unese mjesecni iznos stednje: ");
	        double uplata = unos.nextDouble();
	        System.out.print("Broj mjeseci nakon kojeg bi zelio znati stanje: ");
	        int mjeseci = unos.nextInt();
	        double stanje = 0;
	        double stopa = 1 + 0.00417;
	        for (int i=0;i<mjeseci;i++){
	        	stanje = (uplata + stanje) * stopa;
	        	}
	        System.out.printf("Nakon %1d mjeseci, stanje na vasem racunu ce biti %.4f", mjeseci, stanje);
	        unos.close();
	        }}
			