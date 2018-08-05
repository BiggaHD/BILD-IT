package Zadaca_14;
import java.util.Scanner;

public class Reverse_Number {
	    public static void main(String[] args) {
	        Scanner unos = new Scanner(System.in);
	        System.out.print("Unesite broj ovdje: ");
	        int num = unos.nextInt();
	        System.out.print("Uneseni broj u rikverc je: ");
	        while (num > 0){
	            System.out.print(num%10);
	            num /= 10;}
		    unos.close();
}}
