package rubrica;

import java.util.Scanner;

public class Persona {

	private String cognome,nome,numeroTelefono;

	public Persona() {
		cognome="";
		nome="";
		numeroTelefono="";
	}
	
	public Persona(String cognome, String nome, String numeroTelefono) {
		this.cognome = cognome;
		this.nome = nome;
		this.numeroTelefono = numeroTelefono;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public void visualizza() {
		System.out.println("---------------Contatto---------------");
		System.out.println("  Nome: " + nome);
		System.out.println("  Cognome: " + cognome);
		System.out.println("  Numero di telefono: " + numeroTelefono);
		System.out.println("--------------------------------------");
	}
	
	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		String cognome,nome,numeroTelefono;
		

		System.out.println("Inserisci il nome");
		nome = KB.nextLine();
		setNome(nome);
		
		System.out.println("Inserisci il cognome");
		cognome = KB.nextLine();
		setCognome(cognome);
		
		System.out.println("Inserisci il numero di telefono");
		numeroTelefono = KB.nextLine();
		setNumeroTelefono(numeroTelefono);
		
	}
	
	@Override
	public String toString() {
		return "Persona: cognome=" + cognome + ", nome=" + nome + ", numero di telefono=" + numeroTelefono;
	}
	
}
