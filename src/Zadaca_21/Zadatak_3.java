package Zadaca_21;
import java.util.Scanner;

public class Zadatak_3{

	    public static void main(String[] args){
	        pitaj(3);
	    }
	    
	    public static void pitaj(int brojac){
	        Scanner unos = new Scanner(System.in);
	        int DA = 0;
	        int NE = 0;
	        for (int i=0; i<brojac; i++){
	            int x = (int)(Math.random() * 10);
	            int y = (int)(Math.random() * 10);
	            System.out.print("Koliko je " + x + " - " + y + " ? ");
	            int odgovor = unos.nextInt();
	            if (odgovor == x - y){
	                System.out.println("BINGO!!!");
	                DA++;
	            }else{
	                System.out.println("NOPE -->> " + (x - y));
	                NE++;
	            }}
	        System.out.println("Pogodili ste -->> " + DA + " puta\nPogrijesili ste -->> "+NE+" puta.");
	        unos.close();
	        }}
