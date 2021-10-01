import java.util.ArrayList;

public class Joueur {
	private ArrayList<Carte> jeu;
	private int solde;
	
	public Joueur() {
		this.jeu= new ArrayList<>();
		this.solde=0;
	}
	
	public void setSolde(int solde) {
		this.solde=solde;
	}
	
	public int getSolde() {
		return this.solde;
	}
	
	public void setJeu(Carte carte) throws Exception{
		if (this.jeu.size()>2) {
			throw new Exception();
		}
		this.jeu.add(carte);
	}
	
	public ArrayList<Carte> getJeu(){
		return this.jeu;
	}

	@Override
	public String toString() {
		return "Joueur [jeu=" + jeu + ", solde=" + solde + "]";
	}
	
	
}
