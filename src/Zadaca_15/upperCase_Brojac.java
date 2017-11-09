package Zadaca_15;
import java.util.Scanner;

public class upperCase_Brojac {

	public static void main(String[] args){
		char x;
		int y=0;
		Scanner unos = new Scanner(System.in);
		System.out.print("Pisite ispod:\n");
		String str = unos.nextLine();
		for (int i=0; i<str.length(); i++){
			x = str.charAt(i);
			if (Character.isUpperCase(x)){
				y++;
				}}
		System.out.println("Broj veliki slova ==>> " + y);
		unos.close();
		}}