package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome="Bruno";
		String cognome="Huerta";
		String colorePreferito="giallo";
		int giornoDiNascita=20;
		int meseDiNascita=1;
		int annoDiNascita=1996;
		int sommaDelCompleanno=giornoDiNascita+meseDiNascita+annoDiNascita;
		
		System.out.println("La password è: "+nome+"-"+cognome+"-"+colorePreferito+"-"+sommaDelCompleanno);
	}

}
