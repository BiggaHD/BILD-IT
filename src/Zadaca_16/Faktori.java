package Zadaca_16;
import java.util.Scanner;

public class Faktori{

	public static void main(String[] args){
		        Scanner unos = new Scanner(System.in);
		        System.out.println("Unesi cijeli broj: ");
		        int br = unos.nextInt();
		        unos.close();
		        System.out.println("Faktori broja " + br + " su:");
		        for (int i = 1; i <= br; i++) {
		            if (br % i == 0)
		                System.out.print(i + " ");
		            }}}