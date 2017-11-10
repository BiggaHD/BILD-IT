package Zadaca_16;

public class Armstrong_Brojevi {

	public static void main(String[] args){
		//https://en.wikipedia.org/wiki/Narcissistic_number
		//The sequence of base 10 narcissistic numbers starts: 
		//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407 ... 1634
		
				int n, a, b, c, sum = 0;
				System.out.println("Armstrong brojevi od 0 do 1000: ");
				for (int i = 0; i <= 1000; i++){
					n = i;
					while (n > 0){
						b = n % 10;
						sum = sum + (b * b * b);
						n = n / 10;
					}
					if (sum == i){
						System.out.println(i + " ");
					}
					sum = 0;
				}}}