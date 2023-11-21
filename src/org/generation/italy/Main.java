package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String risposta, cand;
		HashMap<String, Integer> candidati = new HashMap<String, Integer>() {
		{
			put("Mario Rossi",0);
			put("Franco Verdi",0);
			put("Pino Gialli",0);
			put("Gino Marroni",0);
		}
		};
		
		System.out.println("Candidati disponibili: ");
		for (String candidato:candidati.keySet()) {
			System.out.println(candidato);
		}
		
		do {
		System.out.println("Quale candidato scegli?");
		cand = sc.nextLine();
		if (candidati.containsKey(cand)) {
			candidati.put(cand,candidati.get(cand)+1);
		}
		else {
			System.out.println("Il candidato non e presente nella lista");
		}
		
		System.out.println("Vuoi inserire un altro voto? si/no");
		risposta = sc.nextLine();
		} while(risposta.equals("si"));
		
		System.out.println("Risultato votazioni: ");
		for (String candidato:candidati.keySet()) {
			System.out.println(candidato+" "+candidati.get(candidato));
		}
		
		
		
		
	}

}
