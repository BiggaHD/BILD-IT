package Zadaca_15;
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class postotak_Char{    
    public static void postotakKaraktera(String inputString){
        
    	//Dobivanje totalnog broja karaktera
         
        int total = inputString.length();
         
        //Stvaramo varijable i dodajemo im pocetnu vrijednost '0'
         
        int upperCaseSlova = 0, lowerCaseSlova = 0, brojevi = 0, ostalo = 0;
         
        //Prelazimo kroz svaki karakter sa 'for' lupom
         
        for (int i = 0; i < inputString.length(); i++){
            char ch = inputString.charAt(i);
             
            //Ako je upperCase, idemo ++
             
            if(Character.isUpperCase(ch)){
                upperCaseSlova++;
            }
             
            //Ako je lowerCase, ++
             
            else if(Character.isLowerCase(ch)){
                lowerCaseSlova++;
            }
             
            //Ako je broj, idemo ++
             
            else if (Character.isDigit(ch)){
                brojevi++;
            }
             
            //Ako je bilo koji drugi karakter, idemo ostalo++
         
            else{
                ostalo++;
            }
        }
         
        //Racunamo procente pojavljivanja karaktera
         
        double upperCaseLetterPostotak = (upperCaseSlova * 100.0) / total ;
        double lowerCaseLetterPostotak = (lowerCaseSlova * 100.0) / total;
        double digitsPostotak = (brojevi * 100.0) / total;
        double ostaliCharPostotak = (ostalo * 100.0) / total;
        
        //Kao u ranijim lekcijama sto smo radili sa 'Scanner-om', sada radimo sa 'Decimal.Format
        
        DecimalFormat formater = new DecimalFormat("##.##");
         
        //Printamo procente u slijedecem nizu:
         
        System.out.println("U '"+inputString+"' imamo : ");
        System.out.println("===================================");         
        System.out.println("Procenat veliki slova: "+formater.format(upperCaseLetterPostotak)+" % ");
        System.out.println("Procenat mali slova: "+formater.format(lowerCaseLetterPostotak)+" %");
        System.out.println("Procenat brojeva: "+formater.format(digitsPostotak)+" %");
        System.out.println("Drugi karakteri\n(ukljucujuci i prazna mjesta): "+formater.format(ostaliCharPostotak)+" %");
        System.out.println("===================================");
    }
     //Nakon svega imamo osnovnu metodu za input, i upotrebu postotakKaraktera metode
    
    public static void main(String[] args){
    	Scanner unos = new Scanner(System.in);
    	System.out.println("Unesite string za analizu: ");
    	postotakKaraktera(unos.nextLine());
        unos.close();
    }
}