package Zadaca_19;

public class zadatak_5 {

			public static void main(String[] args) {
				
				int millis = 100000;	//kako u zadatku pise			
				System.out.println("h:m:s ->\n" + aMiLLi(millis));
			}

			public static String aMiLLi(long millis) {
				millis /= 1000;

				String trenutno = "";
				for (int i = 0; i < 2; i++) {
					trenutno = ":" + millis % 60 + trenutno;
					millis /= 60;
				}
				return millis + trenutno;
			}}
		