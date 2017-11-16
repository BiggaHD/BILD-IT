package Zadaca_19;
//import java.util.Scanner;

public class zadatak_2 {

	    public static void main(String[] args){
	        //Scanner in = new Scanner(System.in);
	        //System.out.print("Please enter an integer to sum the digits of:\n");
	        long data = sumDigits(234);
	        System.out.println("Zbir unesenog niza brojeva je: " + sumDigits(data));
	    }

	    public static int sumDigits(long n){
	        int temp = (int)Math.abs(n);
	        int suma = 0;
	        
	        while(temp != 0){
	            suma += (temp % 10);
	            temp = temp / 10;
	        }

	        return suma;
	    }}
