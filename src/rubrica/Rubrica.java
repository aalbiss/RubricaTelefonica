package rubrica;

import java.util.Scanner;
import java.util.Vector;

public class Rubrica {

	Vector<Persona> rubrica = new Vector<Persona>(10,2);

	public void inserimento() {
		boolean presente=false;

		Persona p = new Persona();
		p.inserimento();

		for (Persona persona : rubrica) {
			if((p.getNome().equalsIgnoreCase(persona.getNome()) && p.getCognome().equalsIgnoreCase(persona.getCognome())) || p.getNumeroTelefono().equalsIgnoreCase(persona.getNumeroTelefono())) {
				System.out.println("Il contatto è già stato inserito");
				presente=true;
			}
		}
		if(!presente) {
			System.out.println("Contatto aggiunto");
			presente=false;
			rubrica.add(p);
		}
	}

	public void visualizza() {
//		for (int i = 0; i < rubrica.size(); i++) {
//			Persona p = rubrica.get(i);   					Another way to print out the person
//			p.visualizza();
//		}

		for (Persona p : rubrica) {
			p.visualizza();
		}
	}

	public void ricerca() {
		Scanner KB = new Scanner(System.in);
		boolean presente = false;
		System.out.println("Inserisci nome da ricercare");
		String nome = KB.nextLine();

		System.out.println("Inserisci cognome da ricercare");
		String cognome = KB.nextLine();


		for (Persona persona : rubrica) {
			if(nome.equalsIgnoreCase(persona.getNome())&& cognome.equalsIgnoreCase(persona.getCognome())) {
				System.out.println("Il numero di telefono di " + nome + " " + cognome + " è: " + persona.getNumeroTelefono());
				presente=true;
				break;
			}

		}
		if(!presente) {
			System.out.println("Nessun contatto presente con questo nome e cognome");
		}

	}

	public void aggiornamento() {
		Scanner KB = new Scanner(System.in);

		System.out.println("Inserisci nome del contatto da aggiornare");
		String nome = KB.nextLine();

		System.out.println("Inserisci cognome del contatto da aggiornare");
		String cognome = KB.nextLine();

		int i = 0;
		for (Persona persona : rubrica) {
			if(nome.equalsIgnoreCase(persona.getNome())&& cognome.equalsIgnoreCase(persona.getCognome())) {
				System.out.println("Inserici il nuovo numero del contatto: ");
				String numero = KB.nextLine();
				
				if(numero.equalsIgnoreCase(persona.getNumeroTelefono())) {
					System.out.println("Questo numero appartiene già ad un altro contatto");
				}
				else {
					persona.setNumeroTelefono(numero);
					rubrica.set(i, persona);
				}
				i++;
				break;
			}
			else {
				System.out.println("Nessun contatto presente con questo nome e cognome");
			}
		}
	}

	public void eliminazione() {
		Scanner KB = new Scanner(System.in);
		boolean presente=false;
		System.out.println("Inserisci nome del contatto da eliminare");
		String nome = KB.nextLine();

		System.out.println("Inserisci cognome del contatto da eliminare");
		String cognome = KB.nextLine();
		int i = 0;

		for (Persona persona : rubrica) {
			if(nome.equalsIgnoreCase(persona.getNome())&& cognome.equalsIgnoreCase(persona.getCognome())) {
				System.out.println("Contatto eliminato");
				presente=true;
				rubrica.remove(i);		
				break;
			}
			i++;
			
		}
		if(!presente) {
			System.out.println("Nessun contatto presente con questo nome e cognome");
		}

	}


}
