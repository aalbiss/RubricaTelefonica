package rubrica;

public class MainRubrica {

	public static void main(String[] args) {
		
		Rubrica r = new Rubrica();
		
		System.out.println("Inserisci primo contatto");
		r.inserimento();
		System.out.println("Inserisci secondo contatto");
		r.inserimento();
		
		r.visualizza();
		
		r.ricerca();
		
		r.aggiornamento();
		
		r.visualizza();
		
	}
	
}
