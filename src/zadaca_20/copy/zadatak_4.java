package zadaca_20.copy;

public class zadatak_4{
       		 
		 public static void main(String[] args){
			 int brojac = 0;
		        for (int i = 2; i < 10000; i++){
		            if (jeLLi(i) && jeLLi(i + 2)){
		            	brojac++;
						if (brojac % 10 != 0) {
							System.out.print("(" + i + " " + (i + 2) + ") ");
						} else {
							System.out.println("(" + i + " " + (i + 2) + ") ");
						}}}}

		    public static boolean jeLLi(long n){
		        if (n < 2) return false;
		        for (int i = 2; i <= n / 2; i++){
		            if (n % i == 0) return false;
		        } return true;
		    }}
