package Zadaca_15;

public class Prosti_Palindrom{
	
			public static void main(String[] args) {
			System.out.print("Najveci prosti palindrom < 1000:\n");
			String temp;
			for(int b=999; b>=1; b--){
				 //idemo dalje ako su brojevi ispod ove vrijednosti 'potrebni'
			if(prosti(b)) {
			temp = Integer.toString(b);
			if(temp.charAt(0)==temp.charAt(temp.length()-1)){
			System.out.println("======================");
			System.out.println(b);
			System.out.println("======================");
			break;
			}}}}
				//Da li je broj prosti (metoda)
			public static boolean prosti(int n){
			for(int i = 1; i<n; i++)
			if(n!=i && i!=1)
			if(n%i == 0)
			return false;
			return true;
			}}