package Zadaca_15;
import java.util.Scanner;
import java.util.Arrays;

// AKO OVAJ ALGORITAM SPADA U BASIC ZNANJE, ONDA SVI PADAMO ODMAH NA PRVOM TESTU ...

public class Min_Br_Novcica{
	
		            public static void main(String args[]) {
		                
		            	int[] kovanice = new int[] {5, 3, 1};
		                Scanner unos = new Scanner(System.in);
		                System.out.println("Unesite iznos: ");
		            	int suma = unos.nextInt();

		                int minBr = new Min_Br_Novcica().numCoins(suma, kovanice);

		                System.out.println("\nBroj potrebnih novcica je " + minBr + "\nda bi se platio iznos od " + suma + " KM.");
		                unos.close();
		            }
		            
		            //https://hr.wikipedia.org/wiki/Denominacija :)
		            
		            public int numCoins(int zbir, int[] Denominacije) {

		                // Krenimo silazno
		                Arrays.sort(Denominacije);
		                for(int i = 0; i < Denominacije.length/2; i++)
		                {
		                    int temp = Denominacije[i];
		                    Denominacije[i] = Denominacije[Denominacije.length - i - 1];
		                    Denominacije[Denominacije.length - i - 1] = temp;
		                }
		                
		                // Pokrenite rekurzivni algoritam, ali prvi saznajmo sta je to uopste :/
		                //http://www.mathos.unios.hr/spa/Files/materijali/SPA_skripta_ch08.pdf
		                
		                return brojKovanica(zbir, Denominacije, 0, 0);
		            }

		            public int brojKovanica(int sumTarget, int[] denominacije, int denominationIndex, int numKovanica){

		                // pocetni slucaj -- postavi sumTarget na '0'
		                if (sumTarget == 0) return numKovanica;

		                // Runtime Error report (ovo je suvisno za sada, ali heeej, algoritmi)
		                if (denominationIndex > denominacije.length){
		                    throw new RuntimeException("Runtime error stari. Odmori malo taj mozak.");
		                }

		                // Provjera sta je trenutna denominacija?
		                int currentDenomination = denominacije[denominationIndex];

		                // provjera da li je trenutna sumTarget djeljiva sa trenutnom denominacijom?
		                int factor = sumTarget / currentDenomination;

		                // ako ne mozemo smanjiti sumu, idemo na sl denominaciju ...
		                if (factor <= 0) {
		                    // osnova
		                    if (denominationIndex >= denominacije.length){
		                        // vratiti vrijednost od '-1' da se ukaze da je denominacija bila nesupjesna
		                        return -1;
		                    }
		                    
		                    // ako ne, nastavimo dalje
		                    return brojKovanica(sumTarget, denominacije, ++denominationIndex, numKovanica);
		                }
		                
		                // inaèe -->> povecaj br potrebni novcica
		                
		                numKovanica += factor;
		                // smanji sumu
		                
		                sumTarget -= factor * currentDenomination;

		                // uslov ispunjen??
		                if (sumTarget == 0) return numKovanica;

		                // pretjerali sa kalkulacijama -->> onda vrati -1?
		                if (denominationIndex == denominacije.length) return -1;

		                // u drugom slucaju nastavi dalje
		                return brojKovanica(sumTarget, denominacije, ++denominationIndex, numKovanica);
		            }
		        }