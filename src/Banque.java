import java.util.ArrayList;

public class Banque {
	
	

	private ArrayList<Carte> jeu;
	
	public Banque() {
		this.jeu = new ArrayList<>();
	}
	
	public ArrayList<Carte> getJeu(){
		return this.jeu;
	}
	
	public void setJeu(Carte carte) throws Exception{
		if (this.jeu.size()>2) {
			throw new Exception();
		}
		this.jeu.add(carte);
	}

	@Override
	public String toString() {
		return "Banque [jeu=" + jeu + "]";
	}
	
}
