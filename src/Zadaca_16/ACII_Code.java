package Zadaca_16;
import java.util.Scanner;

public class ACII_Code {

	public static void main(String[] args){
		        Scanner unos = new Scanner(System.in);
		        System.out.print("Unesi ASCII code [0 do 127]");
		        int simbol = unos.nextInt();
		        System.out.println((char)(simbol));
		        unos.close();
}}