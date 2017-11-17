package Zadaca_21;

public class Zadatak_2{

	public static void main(String[] args){
		System.out.println("Output metode je -->> " + ukloniChar("Elon Musk", 'E'));}
		 
		    private static String ukloniChar(String str, char ch){
		    	StringBuffer buf = new StringBuffer(str.length());
		        buf.setLength(str.length());
		        int temp = 0;
		        for (int i=0; i<str.length(); i++){
		            char cur = str.charAt(i);
		            if(cur != ch) buf.setCharAt(temp++, cur);
		        }
		        return buf.toString();
}}
