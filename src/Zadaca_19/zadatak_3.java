package Zadaca_19;
import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vrijednosti: ");
		int data = unos.nextInt();
				System.out.println("Matrix bi izgledao ovako:\n");
				matrixXx(data);
				unos.close();
	    }

	    public static void matrixXx(int n) {

	        for (int column = 0; column < n; column++) {

	            for (int row = 0; row < n; row++) {
	                System.out.printf("%1d ", (int)(Math.random() * 2));
	            }
	            System.out.println("");
	            
	        }}}
