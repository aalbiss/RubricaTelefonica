package rubrica;

import java.util.Scanner;

public class MainRubrica {

	public static void main(String[] args) {

		Rubrica r = new Rubrica();

		int selezione;
		Scanner KB = new Scanner(System.in);


		do {
			Utility.inserimento();
			selezione = KB.nextInt();
			KB.nextLine();

			switch (selezione) {
			case 1:
				r.inserimento();
				break;
			case 2:
				r.visualizza();
				break;
			case 3:
				r.ricerca();
				break;
			case 4:
				r.aggiornamento();
				break;
			case 5:
				r.eliminazione();
				break;
			default:
				break;
			}
		}while(selezione!=9);
	}

}
