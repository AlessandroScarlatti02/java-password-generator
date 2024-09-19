package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {

		String name;
		String surname;
		String favouriteColor;
		int day;
		int month;
		int year;
		int sumDate;

		Scanner scan = new Scanner(System.in);
		

		System.out.println("Benvenuto nel generatore automatico di Password!");
		System.out.println("Inserisci i dati che ti verrano richiesti per generare la tua password" + " in automatico");

		System.out.println("Inserisci il tuo Nome");
		name = scan.nextLine();
		
		System.out.println("Inserisci il tuo Cognome");
		surname = scan.nextLine();
		
		System.out.println("Inserisci il tuo Colore Preferito");
		favouriteColor = scan.nextLine();
		
		System.out.println("Inserisci il tuo Giorno di Nascita");
		day = scan.nextInt();
		
		System.out.println("Inserisci il tuo Mese di Nascita");
		month = scan.nextInt();
		
		System.out.println("Inserisci il tuo Anno di Nascita");
		year = scan.nextInt();
		
		sumDate = day+month+year;
		System.out.println("La tua Password è:");
		System.out.println(name + "-" + surname + "-" + favouriteColor + "-" + sumDate);
	System.out.println("Grazie per aver usato il nostro software " + name);
	}
}