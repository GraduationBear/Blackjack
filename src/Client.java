import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		Table table = new Table();
		table.getJoueur().setSolde(100);
		table.getJeudecarte().melanger();
		
		
		
		Scanner reader = new Scanner(System.in);  
		System.out.println("Votre solde de jetons est de : "+ table.getJoueur().getSolde());
		System.out.println("Entrez votre mise: ");
		try {
			table.setMiseDuJ(reader.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//once finished
		reader.close();
		try {
			table.distribuerTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			table.distribuerBanque();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
