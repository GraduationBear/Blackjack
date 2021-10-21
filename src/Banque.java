
import java.util.ArrayList;
import java.util.List;

public class Banque {

	private List<Carte> jeu;
	
	
	public Banque() {
		this.jeu = new ArrayList<>();
	}
	
	public List<Carte> getJeu(){
		return this.jeu;
	}
	
	public void setJeu(Carte carte){
		this.jeu.add(carte);
	}

	@Override
	public String toString() {
		return "Banque [jeu=" + jeu + "]";
	}
	
}
