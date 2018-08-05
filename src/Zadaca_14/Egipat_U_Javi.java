package Zadaca_14;
import java.util.Scanner;

public class Egipat_U_Javi{
	public static void main(String[] args){
			Scanner unos = new Scanner(System.in);
				System.out.println("Unesi duzinu piramide: ");
				int x=unos.nextInt();
				System.out.println("=========================");
				for ( int i=1; i<=x; i++){
					for ( int j=1; j<=i;j++){
						System.out.print(j+" ");}
					System.out.println();}
				System.out.println("=========================");
				for (int i=x; i>=1; i--){
					for ( int j=1; j<=i; j++){
						System.out.print(j+ " ");}
					System.out.println();}
				System.out.println("=========================");
				for (int i=1; i<=x; i++){
					for (int j=0; j<=x-i; j++){
						System.out.print("  ");}
					for (int k=1; k<=i; k++){
						System.out.print(k+" ");}
				System.out.println();}
				System.out.println("=========================");
				for (int i=x; i>=1; i--){
					for (int j=x;j>i;j--){
						System.out.print("  ");}
					for (int k=1; k<=i; k++){
						System.out.print(k+" ");}
					System.out.println();}
				System.out.println("=========================");
				unos.close();
}}
