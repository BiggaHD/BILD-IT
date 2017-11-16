package Zadaca_19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class zadatak_4 {

    public static void main(String[] args) {       
    	datumVrijeme();
    }
    	
    	private static boolean datumVrijeme() {
    	LocalDateTime now = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        System.out.println("Danasnji datum je -->> " + DateTimeFormatter.ofPattern("dd/MM/YYY").format(localDate));
        System.out.println("Trenutno vrijeme je -->> " + DateTimeFormatter.ofPattern("hh:mm:ss").format(now));
		return true;		
        
    }}
